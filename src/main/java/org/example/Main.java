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
        List<Integer> integerList = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .collect(Collectors.toList());

//        integerList.forEach(System.out::println);

        /*
        2. Given a list of strings, write a stream pipeline
        that returns the length of the shortest string in the list.
         */
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        int minLength = strings.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);
        System.out.println(minLength);

        List<String> names = Arrays.asList("Faisal", "Rahul", "Aditya", "Somendra", "Zareen", "Messi", "Naruto");
        int maxLengthName = names.stream().mapToInt(name -> name.length())
                .max()
                .orElse(0);

        System.out.println(maxLengthName);

        /*
        3. Given a list of strings, write a stream
        pipeline that returns a new list of strings with all vowels removed.
         */
        List<String> collect = strings.stream()
                .map(s -> s.replaceAll("[aeiouAEIOU]", ""))
                .collect(Collectors.toList());
        collect.forEach(e -> System.out.print(e + " "));
    }
}