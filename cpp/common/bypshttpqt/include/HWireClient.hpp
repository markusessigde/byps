#ifndef HWIRECLIENT_HPP
#define HWIRECLIENT_HPP

#include "HWireClient.h"
#include "HWireClientI.h"
#include <random>



namespace com { namespace wilutions { namespace byps { namespace http {

BINLINE QIODevice_PBytes::QIODevice_PBytes(PBytes bytes) : bytes(bytes), pos(0) {

}

BINLINE QIODevice_PBytes::QIODevice_PBytes() : pos(0) {
    bytes = BBytes::create(10*1000);
}

BINLINE PBytes QIODevice_PBytes::getBytes() {
    return bytes;
}

BINLINE bool QIODevice_PBytes::isSequential() const {
    return true;
}

BINLINE bool QIODevice_PBytes::reset() {
    pos = 0;
    return true;
}

BINLINE qint64 QIODevice_PBytes::size() const {
    return (qint64)bytes->length;
}

BINLINE qint64 QIODevice_PBytes::readData(char *data, qint64 maxlen) {
    qint64 ret = -1LL;
    qint64 length = (qint64)bytes->length;

    if (pos < length) {
        ret = std::min(maxlen, length-pos);
        memcpy(data, bytes->data + pos, ret);
        pos += ret;
    }
    else if (pos == length) {
        pos++;
        ret = 0;
    }

    return ret;
}

BINLINE qint64 QIODevice_PBytes::writeData(const char *data, qint64 len) {
    qint64 capacity = (qint64)bytes->length;
    if (pos + len > capacity) {
        bytes = BBytes::create(bytes, 2*capacity);
        if (!bytes) return -1LL;
    }
    memcpy(bytes->data + pos, data, len);
    pos += len;
    return len;
}


BINLINE HWireClient_RequestsToCancel::HWireClient_RequestsToCancel(QNetworkAccessManager* netwManager)
    : netwManager(netwManager)
    , isCanceled(false)
{
}

BINLINE QNetworkAccessManager* HWireClient_RequestsToCancel::getNetworkManager() {
    return netwManager;
}

BINLINE bool HWireClient_RequestsToCancel::add(intptr_t id, PWireClient_RequestToCancel r) {
    byps_unique_lock lock(mutex);
    bool succ = !isCanceled;
    if (succ) {
        map[id] = r;
    }
    return succ;
}

BINLINE void HWireClient_RequestsToCancel::addCancelMessage(intptr_t id, PWireClient_RequestToCancel r) {
    byps_unique_lock lock(mutex);
    map[id] = r;
}

BINLINE void HWireClient_RequestsToCancel::remove(intptr_t id) {
    byps_unique_lock lock(mutex);
    map.erase(id);
}

BINLINE void HWireClient_RequestsToCancel::cancel() {
    byps_unique_lock lock(mutex);
    for (std::map<intptr_t, PWireClient_RequestToCancel>::iterator it = map.begin(); it != map.end(); it++) {
        (*it).second->cancel();
    }
    isCanceled = true;
}

BINLINE HWireClient_RequestsToCancel::~HWireClient_RequestsToCancel() {
    map.clear();
}

BINLINE HWireClient_RequestToCancel::HWireClient_RequestToCancel(
        const std::wstring& urlPath,
        int32_t urlFlags,
        int64_t timeoutMillisClient,
        int64_t timeoutMillisRequest,
        PWireClient_RequestsToCancel requestsToCancel,
        PAsyncResult asyncResult)
    : id(reinterpret_cast<intptr_t>(this))
    , requestsToCancel(requestsToCancel)
    , asyncResult(asyncResult)
    , url(QString::fromUtf16((ushort*)urlPath.c_str()))
    , urlFlags(urlFlags)
    , timeoutMillisClient(timeoutMillisClient)
    , timeoutMillisRequest(timeoutMillisRequest)
    , statusCode(0)
    , contentLength(0)
    , reply(NULL)
{

}

BINLINE void HWireClient_RequestToCancel::connectEvents() {
    connect(reply, SIGNAL(finished()),
            this, SLOT(httpFinished()));
    connect(reply, SIGNAL(readyRead()),
            this, SLOT(httpReadyRead()));
}

BINLINE void HWireClient_RequestToCancel::get() {
    reply = requestsToCancel->getNetworkManager()->get(QNetworkRequest(url));
    connectEvents();
}

BINLINE void HWireClient_RequestToCancel::post(QIODevice* postData) {
    reply = requestsToCancel->getNetworkManager()->post(QNetworkRequest(url), postData);
    connectEvents();
}

BINLINE void HWireClient_RequestToCancel::put(QIODevice* postData) {
    reply = requestsToCancel->getNetworkManager()->put(QNetworkRequest(url), postData);
    connectEvents();
}

BINLINE void HWireClient_RequestToCancel::httpFinished() {
    finishOnOK();
}

BINLINE void HWireClient_RequestToCancel::httpReadyRead() {
    onReadComplete();
}

BINLINE void HWireClient_RequestToCancel::onReadComplete() {
    if (reply) {
        reply->readAll();
    }
}

BINLINE void HWireClient_RequestToCancel::close() {
    cancel();

    PWireClient_RequestsToCancel r = requestsToCancel;
    if (r) {
        requestsToCancel.reset();
        r->remove(id); // delete this
        r.reset();
    }

    reply->deleteLater();
    reply = NULL;
}

BINLINE void HWireClient_RequestToCancel::cancel() {
    if (reply) {
        reply->abort();
    }
}

BINLINE void HWireClient_RequestToCancel::finishOnError(const BException& ex) {
    if (asyncResult) {
        asyncResult->setAsyncResult(BVariant(ex));
        asyncResult = NULL;
    }
    close();
}

BINLINE void HWireClient_RequestToCancel::finishOnOK() {
    close();
}


BINLINE HWireClient_SendMessage::HWireClient_SendMessage(
        const std::wstring &urlPath,
        int32_t urlFlags,
        int64_t timeoutMillisClient,
        int64_t timeoutMillisRequest,
        PWireClient_RequestsToCancel requestsToCancel,
        PAsyncResult asyncResult,
        int64_t messageId,
        PBytes bytes)
    : HWireClient_RequestToCancel(urlPath, urlFlags, timeoutMillisClient, timeoutMillisRequest, requestsToCancel, asyncResult)
    , messageId(messageId)
    , requestData(new QIODevice_PBytes(bytes))
    , responseData(new QIODevice_PBytes())
{
    contentLength = (int64_t)bytes->length;
}

BINLINE HWireClient_SendMessage::~HWireClient_SendMessage() {
    delete requestData;
    delete responseData;
}

BINLINE void HWireClient_SendMessage::send() {
    post(requestData);
}

BINLINE void HWireClient_SendMessage::finishOnOK() {
    BMessageHeader header;
    try {
        PBytes respBytes = responseData->getBytes();

        if (BNegotiate::isNegotiateMessage(respBytes)) {
            header.messageId = messageId;
        }
        else {
            BBuffer buf(BBinaryModel::MEDIUM(), respBytes, BBIG_ENDIAN);
            header.read(buf);
        }

        std::vector<PStreamRequest> streams;
        PMessage msg(new BMessage(header, respBytes, streams));

        asyncResult->setAsyncResult(BVariant(msg));
        asyncResult = NULL;

        HWireClient_RequestToCancel::finishOnOK();

    } catch (const BException& ex) {
        finishOnError(ex);
    }
}

BINLINE void HWireClient_SendMessage::onReadComplete() {
    responseData->write(reply->readAll());
}

BINLINE PWire HWireClient::create(const std::wstring& url, int32_t flags, int32_t timeoutSeconds, PThreadPool tpool) {
    HWireClient* pThis = new HWireClient(url, flags, timeoutSeconds, tpool);
    pThis->init();
    return PWire(pThis);
}

BINLINE HWireClient::HWireClient(const std::wstring& surl, int32_t , int32_t timeoutSeconds, PThreadPool tpool)
    : url(surl)
    , urlFlags(0)
    , timeoutMillisClient((DWORD)timeoutSeconds * 1000)
    , tpool(tpool)
    , isMyThreadPool(!tpool)
{
    if (isMyThreadPool) {
        this->tpool = BThreadPool::create(10);
    }
}

BINLINE void HWireClient::init() {
    requestsToCancel = PWireClient_RequestsToCancel(new HWireClient_RequestsToCancel(&netwManager));
}

BINLINE HWireClient::~HWireClient() {
}

BINLINE void HWireClient::send(const PMessage& msg, PAsyncResult asyncResult) {
    internalSend(msg, asyncResult, timeoutMillisClient);
}

BINLINE void HWireClient::sendR(const PMessage& msg, PAsyncResult asyncResult) {
    internalSend(msg, asyncResult, INT64_MAX);
}

BINLINE PContentStream HWireClient::getStream(int64_t messageId, int64_t streamId) {
    return PContentStream();
}

BINLINE int64_t HWireClient::makeMessageId() {
    int64_t v = rand();
    return v >= 0 ? v : -v;
}

BINLINE void HWireClient::done() {

}

BINLINE void HWireClient::cancelAllRequests() {

}

BINLINE PTestAdapter HWireClient::getTestAdapter()  {
    return PTestAdapter();
}

}}}}

#endif // HWIRECLIENT_HPP
