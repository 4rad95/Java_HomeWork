package org.example.HW_12_220224.task3;

//
//3)** Автозаправка. По умолчанию автомобили заправляются согласно стандартной очереди FIFO. Но автомобили скорой помощи
//всегда заправляются вне очереди.
//В час пик, общественные автобусы получают максимальный приоритет по заправке, но скорая помощь все равно более приоритетна.
//Во время стихийных бедствий (снегопад, наводнение) технологический транспорт городских служб заправляется вне очереди.
//Какую бы коллекцию Вы использовали для реализацию данного алгоритма?
//
//        Напишите программу, которая бы имитировала работу.

import java.util.Comparator;
import java.util.PriorityQueue;

public class Zapravka {
    public static void main(String[] args) {



        PriorityQueue<Transport> zapravkaQueue = new PriorityQueue<>(standart);
        PriorityQueue<Transport> extraQueue    = new PriorityQueue<>(extra);
        PriorityQueue<Transport> peakQueue     = new PriorityQueue<>(peak);

        zapravkaQueue.offer(new Transport(9,9, 9, "Легковой автомобиль 1"));
        zapravkaQueue.offer(new Transport(9,9, 9,"Легковой автомобиль 2"));
        zapravkaQueue.offer(new Transport(9,9, 9,"Легковой автомобиль 3"));
        zapravkaQueue.offer(new Transport(0,1, 2,"Скорая помощь"));
        zapravkaQueue.offer(new Transport(9,2, 9,"Автобус"));
        zapravkaQueue.offer(new Transport(9,9, 1,"Технологический транспорт городских служб "));

        extraQueue.addAll(zapravkaQueue);
        peakQueue.addAll(zapravkaQueue);

        System.out.println("Стандартная очередь на заправку ");
        while (!zapravkaQueue.isEmpty()){
            System.out.println(zapravkaQueue.poll());
    }
        System.out.println();

        System.out.println("Очередь на заправку в час пик ");

        while (!peakQueue.isEmpty()){
            System.out.println(peakQueue.remove());
        }

        System.out.println();

        System.out.println("Очередь на заправку в Экстренной ситуации  ");

        while (!extraQueue.isEmpty()){
            System.out.println(extraQueue.remove());
        }

    }

    public static Comparator<Transport> standart = new Comparator<Transport>(){

        @Override
        public int compare(Transport o1, Transport o2) {
            return (int) (o1.standartPrioritet - o2.standartPrioritet);
        }};
        public static Comparator<Transport> peak = new Comparator<Transport>(){

            @Override
            public int compare(Transport o1, Transport o2) {
                return (int) (o1.peakTime - o2.peakTime);
            }
    };
    public static Comparator<Transport> extra = new Comparator<Transport>(){

        @Override
        public int compare(Transport o1, Transport o2) {
            return (int) (o1.extraPrioritet - o2.extraPrioritet);
        }
    };
}
