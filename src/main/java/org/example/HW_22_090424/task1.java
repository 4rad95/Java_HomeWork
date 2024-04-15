package org.example.HW_22_090424;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

// 1 уровень сложности: 1. Пользователь с клавиатуры вводит цифру. Вы создаете динамически нужное количество потоков равное
//                         введенной цифре, нумеруете их и запускаете на выполнение.
//                         Каждый поток должен выводить свой номер на экран 100 раз с интервалом 100 миллисекунд перед каждым выводом.
//                         Сделайте так, чтобы главный поток выполнения программы не завершился до окончания работы всех дочерних потоков.


public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Ввведите количесво потоков (int) : ");
        int count = sc.nextInt();

        ExecutorService executorService = Executors.newFixedThreadPool(count);

        for (int i = 0; i < count; i++) {
                    myThread newThread = new myThread(i);
                    executorService.execute(newThread);
        }
        try {
            executorService.shutdown();
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All thread complete!");
    }

}
class myThread implements Runnable{
    private final int numberThread;
    public myThread(int numberThread) {
        this.numberThread = numberThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Поток #" + numberThread + ": " + i);
            try {
               sleep(100); // Ожидание 100 мс
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

