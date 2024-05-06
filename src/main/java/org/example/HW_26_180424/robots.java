package org.example.HW_26_180424;

import java.util.Scanner;

// 1 уровень сложности: 1. У вас есть стол, на который один робоманипулятор кладет деталь, а второй забирает эту деталь.
//Когда Робот1 положит деталь на стол, он должен обязательно ждать, пока Робот2 заберет эту деталь и только тогда класть следующую. Постройте программу, которая автоматизирует эту работу.
//        Количество деталей, которые должны обработать манипуляторы, пользователь задает с клавиатуры.


class RobotManipulator implements Runnable {
    private final String name;
    private Object table;
    private final Object lock;
    private int partsToProcess;

    public RobotManipulator(String name, Object table, Object lock, int partsToProcess) {
        this.name = name;
        this.table = table;
        this.lock = lock;
        this.partsToProcess = partsToProcess;
    }

    @Override
    public void run() {
        for (int i = 0; i < partsToProcess; i++) {
            synchronized (lock) {
                try {
                    while (table != null) {
                        lock.wait();
                    }
                    table = name + "'s part";
                    System.out.println(name + " положил деталь на стол");
                    lock.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock) {
                table = null;
                System.out.println(name + " забрал деталь со стола");
                lock.notify();
            }
        }
    }
}

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Object table = null;
            Object lock = new Object();

            System.out.print("Введите количество деталей для обработки: ");
            int partsToProcess = scanner.nextInt();

            Thread robot1 = new Thread(new RobotManipulator("Робот1", table, lock, partsToProcess));
            Thread robot2 = new Thread(new RobotManipulator("Робот2", table, lock, partsToProcess));
            robot1.start();
            robot2.start();

            try {
                robot1.join();
                robot2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Работа завершена.");
            scanner.close();
        }
    }

