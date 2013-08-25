#ifndef BTRANSPORT_H_
#define BTRANSPORT_H_

#include "Byps.h"

namespace com { namespace wilutions { namespace byps {

class BTransport : public byps_enable_shared_from_this<BTransport> {
public:
    const PWire wire;
    const PRemoteRegistry remoteRegistry;
    const PApiDescriptor apiDesc;

    BTransport(PApiDescriptor apiDesc, const PWire& wire, const PRemoteRegistry& remoteRegistry);
    BTransport(const BTransport& rhs, const BTargetId& targetId);
	virtual ~BTransport();

    POutput getOutput();
    POutput getResponse(BMessageHeader& requestHeader);
    PInput getInput(BMessageHeader& header, PBytes &buf);

    BTargetId getTargetId();
    void setTargetId(BTargetId targetId);

    PProtocol getProtocol();

    void send(const PSerializable& obj, PAsyncResult asyncResult);
	void recv(PServer server, PMessage message, PAsyncResult asyncResult);

	void negotiateProtocolClient(PAsyncResult asyncResult);
	PProtocol negotiateProtocolServer(const BTargetId& targetId, PBytes& buf, PAsyncResult asyncResult);

protected:
    PProtocol createNegotiatedProtocol(BNegotiate& nego);
    PProtocol detectProtocolFromInputBuffer(const PBytes& buf);

    PProtocol protocol;
    BTargetId targetId;

    byps_mutex mtx;

	friend class BTransport_NegotiateClient_BAsyncOuterResult;

	// Declare BOutput, BInput as friend class to be able to access targetId
	// without byps_unique_lock via getOutput() { getProtocol() { getOutput(transport, ...) { transport->targetId
	friend class BOutput;
	friend class BInput;
};

}}}



#endif