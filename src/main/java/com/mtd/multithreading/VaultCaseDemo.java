package com.mtd.multithreading;

import java.util.Random;

public class VaultCaseDemo {

    public static int MAX_NUMBER = 999;
    public static int MIN_NUMBER = 1;


    public static void main(String[] args) {

        Random random = new Random();
        Vault vault = new Vault(random.nextInt(MAX_NUMBER));
        AscendingThread thread = new AscendingThread(vault);
        DescendingThread thread1 = new DescendingThread(vault);
        PoliceThread thread2 = new PoliceThread();
        thread.start();
        thread1.start();
        thread2.start();

    }

    private static class Vault {

        private int password;

        Vault(int password) {
            this.password = password;
        }

        public boolean isCorrectPassword(int guess) throws InterruptedException {
            Thread.sleep(5);
            return this.password == guess;
        }
    }

    private static abstract  class HackerThread extends  Thread {
        protected Vault vault;
        HackerThread(Vault vault) {
            this.vault = vault;
            this.setName(this.getClass().getSimpleName());
            this.setPriority(Thread.MAX_PRIORITY);
        }

        @Override
        public void start() {
            super.start();
        }
    }

    private static class AscendingThread extends HackerThread {
        AscendingThread(Vault vault) {
            super(vault);
        }

        @Override
        public void run() {
            System.out.println("Started Ascending Thread");
            for (int i = MIN_NUMBER; i <= MAX_NUMBER; i++) {
                try {
                    if(vault.isCorrectPassword(i)){
                        System.out.println("Vault system is hacked !!!");
                        System.out.println("Hacked by : "+this.getClass().getName());
                        System.exit(0);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class DescendingThread extends HackerThread {
        DescendingThread(Vault vault) {
            super(vault);
        }

        @Override
        public void run() {
            System.out.println("Started Descending Thread");
            for (int i = MAX_NUMBER; i >= MIN_NUMBER; i--) {
                try {
                    if(vault.isCorrectPassword(i)){
                        System.out.println("Vault system is hacked !!!");
                        System.out.println("Hacked by : "+this.getClass().getName());
                        System.exit(0);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class PoliceThread extends Thread {
        @Override
        public void run() {
            System.out.println("Started Police Thread");
            for(int i = 10; i > 0; i--) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Time left : "+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Game Over. vault is safe !!!");
            System.exit(0);
        }
    }
}
