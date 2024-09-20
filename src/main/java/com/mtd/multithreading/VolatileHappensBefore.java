package com.mtd.multithreading;


class ThreadA extends Thread {

    @Override
    public void run() {
        VolatileHappensBefore volatileHappensBefore = new VolatileHappensBefore();
        try {
            volatileHappensBefore.write();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadB extends Thread {

    @Override
    public void run() {
        VolatileHappensBefore volatileHappensBefore = new VolatileHappensBefore();
        try {
            volatileHappensBefore.read();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class VolatileHappensBefore {
    int a = 8;
    int b = 0;
    volatile boolean myVolatile = false;


    public void write() throws InterruptedException {

        // Thread A. Program order
        System.out.println(System.currentTimeMillis());
        a = 5;
        b = 6;
        myVolatile = true; // <-- write
        System.out.println(System.currentTimeMillis());
        System.out.println("Execute  : " + myVolatile);

        System.out.println(Thread.currentThread().getName());
    }

    //Thread B. Program order
    public void read() throws InterruptedException {

        Thread.sleep(2000); //just to show that writing into `myVolatile`(Thread A) was executed before
        System.out.println(System.currentTimeMillis());
        System.out.println(myVolatile); // <-- read
        System.out.println(a);  //prints 5, not 1
        System.out.println(b);  //prints 6, not 2
        System.out.println(System.currentTimeMillis());
    }

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(new ThreadA());
        Thread t2 = new Thread(new ThreadB());

        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread.sleep(2000);
        t2.start();

    }

}
