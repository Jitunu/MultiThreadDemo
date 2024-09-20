package com.mtd.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.Proxy;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

public class CglibProxyDemo{

    public static void main(String[] args) {

        List<Integer> listInt = Arrays.asList(100,100,70,50,60,20,20,10,10,5);
        List<String> listInt1 = Arrays.asList("100","100","70","50","60","20","20","10","10","5");

//        listInt.stream(). collect(Collectors. toMap());
        Map<Object, Long> map = listInt.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<Object, Set<Integer>> map1 = listInt.stream().collect(Collectors.groupingBy(c -> c,
                mapping(a->a,
                        toSet())));

        System.out.println(map);
        System.out.println(map1);

//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(PrintMessage.class);
//        enhancer.setCallback((FixedValue) () -> "Jitunu");
//        PrintMessage printMessage = (PrintMessage) enhancer.create();
//        printMessage.printName("OK");
    }
}
