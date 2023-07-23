package com.application.employee.util;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddNumber8 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
            List<String> stringList = Arrays.asList("green", "yellow", "red", "green", "red", "yellow", "green", "blue");
            List<Integer> oddNumbers = numbers.stream().filter(o -> o % 2 != 0).collect(Collectors.toList());
            System.out.println(oddNumbers);
            List<Integer> evenNumbers = numbers.stream().filter(o -> o % 2 == 0).collect(Collectors.toList());
            System.out.println(evenNumbers);

            Map<String,Long> collect = stringList.stream().collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ));
            Map <String,Long> stringCount = stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            System.out.println(collect);
            System.out.println(stringCount);

        }

}
