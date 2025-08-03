#include "collatz_conjecture.h"

int steps(int start) {
    if (start <= 0) {
        return -1;
    }
    
    int count = 0;
    int current = start;

    while (current != 1) {
        if (current % 2 == 0) {
            current = current / 2;
            count = count + 1;
        }
        else {
            current = (current * 3) + 1;
            count = count + 1;
        }
    }
    return count;
}