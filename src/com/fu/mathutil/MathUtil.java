package com.fu.mathutil;

public class MathUtil {

    public static long getFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
        }
        
        long x = 1;
        for (int i = 2; i <= n ; i++) {
            x *= i;
        }
        
        return x;
    }
}
