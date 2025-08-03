#include "difference_of_squares.h"

unsigned int sum_of_squares(unsigned int number) {
    unsigned int sum = 0;
    for (unsigned int n = 0; n <= number; n++) {
        sum = sum + (n * n);
    }
    return sum;
}
unsigned int square_of_sum(unsigned int number) {
    unsigned int sum = 0;
    for (unsigned int n = 0; n <= number; n++) {
        sum = sum + n ;
    }
    return sum * sum;
}

unsigned int difference_of_squares(unsigned int N) {
    unsigned int squareOfSum = square_of_sum(N);
    unsigned int sumOfSquares = sum_of_squares(N);

    return squareOfSum - sumOfSquares;
    
}