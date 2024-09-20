package com.mtd.multithreading;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceExample {
    public static AtomicReference<String> val = new AtomicReference<String>("Jitunu");


    public static void main(String[] args) {
        val.set("NewVal");
        if (val.compareAndSet("Jitunu", "Rajashree")) {
            System.out.println("Changed :: "+val.get());
        } else {
            System.out.println("Nothing :: "+val.get());
        }
    }


}

