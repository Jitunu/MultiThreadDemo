package com.mtd.multithreading;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerDemo {
    public LinkedList<String> stringLinkedList = new LinkedList<>();
    int capacity = 5;
    public Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    AtomicInteger count = new AtomicInteger(0);
    public void producer() throws InterruptedException{
        lock.lock();
        try {
        while(true) {
            if(capacity == stringLinkedList.size()) {
                condition.await();
            }
            String s = "Hello "+count.incrementAndGet();
            System.out.println("Producer produced- : "+s);
            stringLinkedList.add(s);
            condition.signal();
            Thread.sleep(1000);
        }
        }finally {
            lock.unlock();
        }

    }

    public void consumer() throws InterruptedException{
        lock.lock();
        try {
            while(true) {
               if(stringLinkedList.size() == 0) {
                   condition.await();
               }
               System.out.println("Consumer consumed- : "+stringLinkedList.removeFirst());
               condition.signal();
                Thread.sleep(1000);
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumerDemo p = new ProducerConsumerDemo();
        Thread producerThread = new Thread(() -> {
          try {
                p.producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                p.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();
    }
}
