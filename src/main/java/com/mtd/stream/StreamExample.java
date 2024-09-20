package com.mtd.stream;

import com.mtd.solid.FunctionalInterfaceDemo;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        System.out.println("===========================================================");
        myList.stream().filter((l) -> l % 2 == 0)
                .sorted()
                .forEach(System.out::println);
        System.out.println("===========================================================");
        myList.stream().map((s) -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
        System.out.println("===========================================================");
        myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(s -> !set.add(s)).forEach(System.out::println);
        System.out.println("===========================================================");
        myList.stream().findFirst().ifPresent(System.out::println);
        System.out.println("===========================================================");
        myList.stream().max(Integer::compareTo).ifPresent(System.out::println);
        System.out.println("===========================================================");

        String input = "Java Hungry Blog Alive is Awesome";
        input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() == 1).map(entry -> entry.getKey()).findFirst().ifPresent(System.out::println);

        System.out.println("===========================================================");
        List<String> nameList =
                Arrays.asList("Karen", "Mia", "Sydney", "Lacey", "Megan");
        nameList.stream().filter((x) -> x.startsWith("M")).forEach(System.out::println);
        System.out.println("===========================================================");

        Predicate<String> p = s -> s.startsWith("M");
        for (String name : nameList)
            if (p.test(name)) {

                System.out.println(name);
            }

        FunctionalInterfaceDemo<String> fi = s -> s.startsWith("L");
        for (String name : nameList)
            if (fi.check(name)) {
                System.out.println(name);
            }
        FunctionalInterfaceDemo.testMethod();
    }
}
