package com.mtd.multithreading;

import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionalLockDemo {
    Lock lock = new ReentrantLock();
    Condition conditionLock = lock.newCondition();
    boolean isComplete = false;


    public void task() throws InterruptedException{
       lock.lock();
        try {
            while (!isComplete) {
                conditionLock.await();
            }
        } finally {
            lock.unlock();
        }
    }

    public void task2() {
        lock.lock();
        try {
            isComplete = true;
            conditionLock.signal();
        } finally {

            lock.unlock();
        }

    }
}

