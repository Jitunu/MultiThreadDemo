package com.mtd.multithreading;

public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside Run method of : " +this.getClass().getName()+" class");
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableDemo());
        thread.start();
    }
}
