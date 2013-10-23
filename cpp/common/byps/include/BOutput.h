#ifndef BOUTPUT_H_
#define BOUTPUT_H_

#include "Byps.h"

namespace byps {

using namespace ::std;

class BOutput : public BIO {
public:
    BOutput(PTransport transport, BVERSION nNegotiatedVersion, BByteOrder negotiatedByteOrder);
    BOutput(PTransport transport, const BMessageHeader& responseHeader);
    virtual ~BOutput();
    void store(PSerializable ptr);
	
	void setException(const BException& ex);

    virtual PStreamRequest createStreamRequest(PContentStream inputStream);

    PMessage toMessage();

protected:

    typedef unordered_map<const void*, BPOINTER> OBJMAP;
    OBJMAP objMap;
    BPOINTER nextPointer;
    vector<PStreamRequest> streams;

    virtual void internalStoreObj(POBJECT, bool bUnique, BSERIALIZER ser, BTYPEID typeId);
    virtual void internalStoreObjS(PSerializable, bool bUnique, BSERIALIZER ser, BTYPEID typeId);
};


}

#endif /* BOUTPUT_H_ */
