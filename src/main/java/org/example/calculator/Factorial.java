package org.example.calculator;

public class Factorial {

    public int calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be >= 0");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}