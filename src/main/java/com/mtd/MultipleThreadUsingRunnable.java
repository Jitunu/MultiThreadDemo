package com.mtd;

import java.util.ArrayList;
import java.util.List;

class RunnableOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside Run method of : "+this.getClass().getName()+" Class and the thread is "+Thread.currentThread().getName());
    }
}

class RunnableTwo implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside Run method of : "+this.getClass().getName()+" Class and the thread is "+Thread.currentThread().getName());
    }
}

class RunnableThree implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside Run method of : "+this.getClass().getName()+" Class and the thread is "+Thread.currentThread().getName());
    }
}


public class MultipleThreadUsingRunnable {
    public static void main(String[] args) {

        System.out.println("Inside Main Thread : "+Thread.currentThread().getName());
        List<Thread> threadList = new ArrayList<>();
        threadList.add(new Thread(new RunnableOne()));
        threadList.add(new Thread(new RunnableTwo()));
        threadList.add(new Thread(new RunnableThree()));

        for (Thread thread : threadList) {
            thread.start();
        }
    }
}
