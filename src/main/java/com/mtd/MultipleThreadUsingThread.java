package com.mtd;


import java.util.ArrayList;
import java.util.List;

class ThreadOne extends Thread {
    @Override
    public void run() {
        System.out.println("Inside Run method of : "+this.getClass().getName()+" Class and the thread is "+this.getName());
    }
}

class ThreadTwo extends Thread {
    @Override
    public void run() {
        System.out.println("Inside Run method of : "+this.getClass().getName()+" Class and the thread is "+this.getName());
    }
}

class ThreadThree extends Thread {
    @Override
    public void run() {
        System.out.println("Inside Run method of : "+this.getClass().getName()+" Class and the thread is "+this.getName());
    }
}

class ThreadFour extends Thread {
    @Override
    public void run() {
        System.out.println("Inside Run method of : "+this.getClass().getName()+" Class and the thread is "+this.getName());
    }
}
public class MultipleThreadUsingThread {
    public static void main(String[] args) {
        System.out.println("Inside Main Thread : "+ Thread.currentThread().getName());
        List<Thread> threadList = new ArrayList<>();
        threadList.add(new ThreadOne());
        threadList.add(new ThreadTwo());
        threadList.add(new ThreadThree());
        threadList.add(new ThreadFour());
        for(Thread t : threadList) {
            t.start();
        }
    }


}
