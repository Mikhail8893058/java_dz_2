package org.example;

class recursion {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }

        double res = 1;

        while (n != 0) {
            if ((n & 1) == 1) {
                if (n > 0) {
                    res *= x;
                }
                else {
                    res /= x;
                }
            }
            x *= x;
            n /= 2;
        }
        return res;
    }
}