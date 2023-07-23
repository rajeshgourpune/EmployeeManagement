package com.application.employee.util;

import java.util.stream.LongStream;

public class Factorial {

    public static long factorialStreams(long n) {
        return LongStream.rangeClosed(2, n)
                .reduce(1, (long a, long b) -> a * b);
    }

    public static void main(String[] args) {

        long factorial = factorialStreams(5);
        System.out.println(factorial);
    }
}
