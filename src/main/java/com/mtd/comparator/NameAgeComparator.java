package com.mtd.comparator;

import java.util.Comparator;

public class NameAgeComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {

        return (o1.getFirstName().compareTo(o2.getFirstName()) != 0)? o1.getFirstName().compareTo(o2.getFirstName()) : o1.getAge() - o2.getAge();
    }
}

