package com.mtd.multithreading;

public class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Inside Run method of : "+this.getClass().getName()+" class");
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
    }
}
