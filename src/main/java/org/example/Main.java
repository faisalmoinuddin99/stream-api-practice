package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*
        1.Given a list of integers, write a stream pipeline
        that returns a list of the squares of the even integers
        in the original list.
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> integerList = numbers.stream().filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .collect(Collectors.toList());

        integerList.forEach(System.out::println);
    }
}