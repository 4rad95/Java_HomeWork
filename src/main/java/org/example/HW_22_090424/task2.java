package org.example.HW_22_090424;


//2*.Посчитайте количество всех целых чисел в диапазоне от Integer.MINVALUE до Integer.MAXVALUE,
//   которые делятся на введенное пользователем число number без остатка.
//   Просчитайте время, которое необходимо для вычисления данного результата в одном потоке.
//   Просчитайте время, которое необходимо пользователю для выполнения этих задачи параллельно,
//   количество создаваемых потоков countThreads пользователь тоже должен ввести вручную .


import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;

public class task2 {
        static AtomicInteger counter = new AtomicInteger(0);
        static int divNum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Ввведите количесво потоков (int) : ");
        int count = sc.nextInt();
        System.out.print(" Ввведите делитель (int) : ");
        divNum = sc.nextInt();
        int min =  Integer.MIN_VALUE;
        int max =  Integer.MAX_VALUE;

        ExecutorService executorService = Executors.newFixedThreadPool(count);
        Long t0 = currentTimeMillis();
        long range = (long) max - min + 1;
        int step =(int) ( range / count) + 1;
        for (int i =  min; i <= max; i += step) {
            int start = i;
            long end = Math.min(max, i + step - 1);
            executorService.execute(new myThreadTask2(start,end));

            }
        try {
            executorService.shutdown();
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long t1 = currentTimeMillis();
        System.out.println("Рассчет окончен :"+counter+" чисел делется на " + divNum + " Затраченно времени : " +(t0-t1)/100+" c. "  );

}}
class myThreadTask2 implements Runnable{

    private final int startNum;
    private final long endNum;
    private int count = 0;
    public myThreadTask2( int startNum, long endNum) {

        this.startNum = startNum;
        this.endNum = endNum;
    }

    @Override
    public void run() {
        for (int i = startNum; i <= endNum; i++) {
            if (i% task2.divNum ==0 ) {
                task2.counter.incrementAndGet();
                System.out.println("i = " +i+ " counter = " + task2.counter);}
        }
        task2.counter.incrementAndGet();
        }
    }

