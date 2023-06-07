package com.application.employee.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumber8 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
            List<Integer> oddNumbers = numbers.stream().filter(o -> o % 2 != 0).collect(Collectors.toList());
            System.out.println(oddNumbers);
        }
}
