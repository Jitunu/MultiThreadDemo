package com.mtd.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLockDemo {


    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        InventoryCount inventoryCount = new InventoryCount();
        Thread incrementThread = new IncrementThread(inventoryCount);
        Thread decrementThread = new DecrementThread(inventoryCount);
        incrementThread.start();
        decrementThread.start();
        incrementThread.join();
        decrementThread.join();
        System.out.println("THE FINAL COUNT :: "+inventoryCount.getFinalCount());
    }
    public static class InventoryCount {
        int count;
        Lock lock = new ReentrantLock();
        public synchronized void increment() {
            lock.lock();
            count++;
            lock.unlock();
        }

        public void decrement() {
            lock.lock();
            count--;
            lock.unlock();
        }

        public int getFinalCount() {
            return this.count;
        }
    }
    public static class IncrementThread extends Thread  {
        InventoryCount inventoryCount;

        IncrementThread(InventoryCount inventoryCount) {
            this.inventoryCount = inventoryCount;
        }

        @Override
        public void run() {
            for(int i = 0; i < 1000; i++) {
                inventoryCount.increment();
            }
        }
    }



    public static class DecrementThread extends Thread  {

        InventoryCount inventoryCount;

        DecrementThread(InventoryCount inventoryCount) {
            this.inventoryCount = inventoryCount;
        }

        @Override
        public void run() {
            for(int i = 0; i < 1000; i++) {
                inventoryCount.decrement();
            }
        }
    }


}
