package com.mtd.comparator;

import com.mtd.solid.FunctionalInterfaceDemo;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ComparatorDemo {
    public static List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        person.setFirstName("Jitunu");
        person.setLastName("sahoo");
        person.setAge(33);
        person.setDepartment("Cards");
        person.setOccupation("IT");
        personList.add(person);
        person = new Person();
        person.setFirstName("Rajashree");
        person.setLastName("sahoo");
        person.setAge(26);
        person.setDepartment("Insurance");
        person.setOccupation("IT");
        personList.add(person);
        person = new Person();
        person.setFirstName("Arupananda");
        person.setLastName("sahoo");
        person.setAge(69);
        person.setDepartment("Retired");
        person.setOccupation("Govt");
        personList.add(person);
        person = new Person();
        person.setFirstName("Santanu");
        person.setLastName("sahoo");
        person.setAge(36);
        person.setDepartment("Testing");
        person.setOccupation("IT");
        personList.add(person);
        person = new Person();
        person.setFirstName("Sakuntala");
        person.setLastName("sahoo");
        person.setAge(63);
        person.setDepartment("House");
        person.setOccupation("House Wife");
        personList.add(person);
        person = new Person();
        person.setFirstName("Amita");
        person.setLastName("panda");
        person.setAge(24);
        person.setDepartment("Finance");
        person.setOccupation("Bank");
        personList.add(person);
        person = new Person();
        person.setFirstName("Swaroop");
        person.setLastName("Jena");
        person.setAge(26);
        person.setDepartment("Insurance");
        person.setOccupation("IT");
        personList.add(person);
        person.setFirstName("Alex");
        person.setLastName("Bell");
        person.setAge(23);
        person.setDepartment("Cards");
        person.setOccupation("IT");

        return personList;
    }
    public static void main(String[] args) {
        List<Person> personList = ComparatorDemo.getPersonList();
        System.out.println("===========================================================");
        for (Person p: personList) {
            System.out.println(p.getFirstName() + " " +p.getAge());
        }
        System.out.println("===========================================================");

        List<Person> personL = personList.stream().sorted(new AgeComparator()).collect(Collectors.toList());
       // System.out.println(personL);
        System.out.println("===========================================================");

//        personL = personList.stream().filter((p) -> p.getAge() == 26)
//                .sorted(Comparator.comparing(Person::getLastName))
//                .collect(Collectors.toList());

        Collections.sort(personList, new FirstNameComparator());

        System.out.println(" :::After First Name Sorting::: ");
        for (Person p: personList) {
            System.out.println(p.getFirstName()+ " " +p.getAge());
        }

        Collections.sort(personList, new AgeComparator());
        System.out.println(" :::After Age Sorting::: ");
        for (Person p: personL) {
            System.out.println(p.getFirstName() + " :: "+p.getAge());
        }


        Collections.sort(personList, Comparator.comparing(Person::getFirstName).thenComparing(Comparator.comparingInt(Person::getAge)));
        System.out.println(" :::After Name and Age Sorting::: ");
        for (Person p: personL) {
            System.out.println(p.getFirstName() + " :: "+p.getAge());
        }

        Collections.sort(personList, new NameAgeComparator());
//        System.out.println(" :::After Name and Age Sorting::: ");
//        for (Person p: personL) {
//            System.out.println(p.getFirstName() + " :: "+p.getAge());
//        }
        Map<Integer, String> testMap = new HashMap<>();

        testMap.put(1, "Jitunu");
        testMap.put(2, "Test");
        testMap.put(3, "Swaroop");
        testMap.put(4, "ABCD");
        testMap.put(5, "Santanu");
        testMap.put(6, "Roza");
        testMap.put(7, "Milan");

        testMap.values().stream().sorted(String::compareTo).forEach(System.out :: println);
    }
}
