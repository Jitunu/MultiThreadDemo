package com.mtd.solid;

@FunctionalInterface
public interface FunctionalInterfaceDemo<T> {
    boolean check(T t);

    static void testMethod(){
        System.out.println("I am a static method inside an interface");
    }

    default void defaultMethod() {
        System.out.println("I am a default method inside an interface");
    }
}
