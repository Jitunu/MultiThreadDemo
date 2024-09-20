package com.mtd.multithreading;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

public class AtomicReferenceProducerConsumer<T> {

    int capacity = 5;
    AtomicReference<StackNode<T>> head = new AtomicReference<>();

    public void producer(T val) {
        StackNode<T> tempStack = new StackNode<>(val);
        while(true) {
            StackNode<T> currentHead = head.get();
            tempStack.next = currentHead;
            if(head.compareAndSet(currentHead, tempStack)){
                break;
            } else {
                LockSupport.parkNanos(1);
            }
        }
    }



    public static void main(String[] args) {
        AtomicReferenceProducerConsumer atomicReferenceProducerConsumer = new AtomicReferenceProducerConsumer();
        Thread t = new Thread(() -> {
            atomicReferenceProducerConsumer.producer("Hello");
        });

        Thread t1 = new Thread(() -> {
            atomicReferenceProducerConsumer.producer("Jitun");
        });

        t.start();
        t1.start();

    }

    public static class StackNode<T> {
        T val;
        StackNode<T> next;
        StackNode(T val) {
            this.val = val;
        }
    }
}
