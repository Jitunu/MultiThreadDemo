package com.mtd.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {

        return (o1.getAge() - o2.getAge() == 0) ? o1.getLastName().compareTo(o2.getLastName()) : o1.getAge() - o2.getAge();
    }
}

