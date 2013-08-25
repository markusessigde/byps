#ifndef HWIRECLIENTI_H_
#define HWIRECLIENTI_H_


#include "HWireClient.h"

namespace com { namespace wilutions { namespace byps { namespace http {

using namespace com::wilutions::byps;

class HWireClient_AsyncResultAfterAllRequests;
class HWireClient_RequestToCancel;
class HWireClient_RequestsToCancel;
typedef byps_ptr<HWireClient_RequestToCancel> PWireClient_RequestToCancel;
typedef byps_ptr<HWireClient_RequestsToCancel> PWireClient_RequestsToCancel;

class HWireClient_RequestsToCancel {
public:

	HWireClient_RequestsToCancel();

	virtual ~HWireClient_RequestsToCancel();
    bool add(intptr_t id, PHttpRequest r);
    void addCancelMessage(intptr_t id, PHttpRequest r);
    void remove(intptr_t id);
	void cancel();


private:

	bool isCanceled;
    byps_mutex mutex;
    std::map<intptr_t, PHttpRequest> map;
};

class HWireClient_AsyncResultAfterAllRequests : public BAsyncResult {
public:
    HWireClient_AsyncResultAfterAllRequests(byps_ptr<HWireClient> wire, PThreadPool tpool, int64_t messageId, PAsyncResult innerResult, size_t nbOfRequests);
	virtual ~HWireClient_AsyncResultAfterAllRequests() {}
    virtual void setAsyncResult(const BVariant& obj);

private:
	byps_weak_ptr<HWireClient> wire;
	PThreadPool tpool;
	int64_t messageId;
    PAsyncResult innerResult;
    size_t nbOfRequests;
    byps_mutex mutex;
    BVariant result;
};

class HWireClient_ExecResult : public BRunnable {
	PAsyncResult asyncResult;
	BVariant var;
public:
	HWireClient_ExecResult(PAsyncResult asyncResult, BVariant var);
	virtual void run();
};

class HWireClient_TestAdapter : public BTestAdapter {
	byps_ptr<HWireClient> wire;
public:

	HWireClient_TestAdapter(byps_ptr<HWireClient> wire) : wire(wire) {
	}

	virtual ~HWireClient_TestAdapter() {}

	virtual void killClientConnections();

};

}}}}

#endif