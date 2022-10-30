package org.example;

public class Factorial {
    public static Integer getFactorial(int num) {
        int sum = 1;
        for (int i = num; i > 0; i--) {
            sum *= i;
        }

        return sum;
    }
}