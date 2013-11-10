#ifndef BWIRE_HPP_
#define BWIRE_HPP_

#include "BWire.h"
#include <stdlib.h>

namespace byps {


BINLINE BWire::~BWire() {
}

BINLINE void BWire::send(const PMessage& , PAsyncResult ) {

}

BINLINE void BWire::sendR(const PMessage& , PAsyncResult ) {

}

BINLINE PContentStream BWire::getStream(int64_t , int64_t ) {
	return PContentStream();
}

BINLINE int64_t BWire::makeMessageId() {
    return 1;
}

BINLINE void BWire::done() {
}

BINLINE void BWire::cancelAllRequests() {
}

BINLINE PTestAdapter BWire::getTestAdapter() {
	return PTestAdapter();
}

}
#endif
