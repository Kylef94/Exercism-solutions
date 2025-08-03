#include "grains.h"

uint64_t square(uint8_t index) {
    if (index <= (uint8_t) 1) {
        return (uint64_t) index;
    } 
    else {
        uint64_t sum = 1;
        for (uint8_t n=2; n <= index; n++) {
            sum = sum * 2;
        }
        return sum;
    }
}

uint64_t total(void) {
    uint64_t sum = 0;

    for (int i = 1; i <= 64; i++) {
        sum = sum + square(i);
    }
    return sum;
}