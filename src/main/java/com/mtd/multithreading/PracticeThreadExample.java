package com.mtd.multithreading;

public class PracticeThreadExample {

    static class WelcomeThread extends Thread {
        @Override
        public void run() {
                    System.out.println("Welcome");

            }
        }

    static class GreetsThread extends Thread {
        @Override
        public void run() {

            System.out.println("Good Morning");
        }
    }

    public static void main(String[] args) {
        WelcomeThread welcomeThread = new WelcomeThread();
        GreetsThread greetsThread = new GreetsThread();

        welcomeThread.start();
        greetsThread.start();
        welcomeThread.setPriority(3);
        greetsThread.setPriority(2);
        System.out.println(welcomeThread.getPriority());
        System.out.println(welcomeThread.getState());
        System.out.println(greetsThread.getPriority());
    }
}
