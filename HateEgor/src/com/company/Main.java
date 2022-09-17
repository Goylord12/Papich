package com.company;

public class Main {

    public static void main(String[] args) {
        AnimalThread th1 = new AnimalThread("Черепашка");
        AnimalThread th2 = new AnimalThread("Зайцонок");
        th1.start();
        th2.start();
    }
}

    class AnimalThread extends Thread {

        AnimalThread(String name) {
            super(name);
        }

        public void run() {

            try {
                for (int i = 0; i < 1100; i = i + 100) {
                    System.out.println(Thread.currentThread().getName() + ": " + i + " метров");
                    if (Thread.currentThread().getName().equalsIgnoreCase("Черепашка") && i == 0) {
                        Thread.sleep(1000);
                    }
                    if (Thread.currentThread().getName().equalsIgnoreCase("Зайцонок") && i == 600) {
                        Thread.sleep(1000);
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
