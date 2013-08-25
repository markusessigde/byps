#ifndef BAPIDESCRIPTOR_H_
#define BAPIDESCRIPTOR_H_

#include "Byps.h"
#include "BRegistry.h"
#include "BBinaryModel.h"

namespace com { namespace wilutions { namespace byps {

class BApiDescriptor {
public:
    const string name;
    const string pack;
    const int32_t version;
    const bool uniqueObjects;
    
    BApiDescriptor(const string& name, const string& package,
			int32_t version, bool uniqueObjects)
    :  name(name), pack(package), version(version), uniqueObjects(uniqueObjects) {
		
	}

	BApiDescriptor* addRegistry(PRegistry reg) {
		this->registry = reg;
		return this;
	}

	string getProtocolIds() {
		return string("S");
	}

	PRegistry getRegistry(BBinaryModel ) {
		return registry;
	}

protected:
	PRegistry registry;

};

}}}

#endif /* BAPIDESCRIPTOR_H_ */