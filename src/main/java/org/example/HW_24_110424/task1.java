package org.example.HW_24_110424;

public class task1 {
    public static void main(String[] args) {

        Thread thread1 = new SumThread("Thread 1");
        Thread thread2 = new SumThread("Thread 2");
        Thread thread3 = new SumThread("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Main thread finished.");
    }

    static class SumThread extends Thread {
        private final String name;

        public SumThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            long sum = 0;
            for (int i = 0; i <= 10_000_000; i++) {
                if (i % 17 == 0) {
                    sum += i;

                    System.out.println(name + ": Sum = " + sum);
                }
            }
        }
    }
}
