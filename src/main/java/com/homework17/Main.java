package com.homework17;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Stream<User> users = Stream.generate(() ->
                new User("Some name" + random.nextInt(100), random.nextInt(91) , "email" + random.nextInt(100) + "@email.com", random.nextBoolean() ? "male" : "female")
        );

        List<User> usersList = users
                .limit(20)
                .filter(user -> user.getAge() > 18)
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> !user.getEmail().isEmpty())
                .collect(Collectors.toList());

        Map<String, List<String>> usersGenderGroups = usersList.stream()
                .collect(Collectors.groupingBy(User::getGender, Collectors.mapping(User::getName, Collectors.toList())));

        System.out.println(usersGenderGroups);
    }
}
