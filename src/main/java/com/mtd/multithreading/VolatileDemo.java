package com.mtd.multithreading;

public class VolatileDemo {

    public volatile int x = 10;

    public synchronized void incrementXVal() {
        for (int i = 0; i < 20000; i++) {
            x++;
        }
    }

    public synchronized int getXVal() {
        return x;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileDemo vd = new VolatileDemo();
        Thread t = new Thread(() -> {
            vd.incrementXVal();
        });
        Thread t1 = new Thread(() -> {
            System.out.println(vd.getXVal());
        });

        t.start();
        t1.start();
    }


}
