package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        /*
        4. Given a list of integers, write a stream pipeline that
        returns a boolean indicating whether any of the integers are negative.
         */
        List<Integer> integers = Arrays.asList(1, -2, -3, 4, 5, -6);
        boolean ans = integers.stream().anyMatch(n -> n < 0);
        System.out.println(ans);

        List<User> userList = new ArrayList<>();
        User user1 = new User(1, "messi", "mumbai");
        User user2 = new User(2, "neymar", "delhi");
        User user3 = new User(3, "ronaldo", "jaipur");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        List<Map.Entry<Integer, String>> idAndFirstName = userList.stream()
                .map(user ->
                        new AbstractMap
                                .SimpleEntry<>(user.getId(), user.getFirstName()))
                .collect(Collectors.toList());

        idAndFirstName.forEach(System.out::println);

        User userCity = userList.stream()
                .filter(user -> user.getCity().equals("mumbai"))
                .findFirst()
                .orElse(null) ;

///       assert userCity != null;
        System.out.println(userCity);


    }
}