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



        PriorityQueue<Transport> zapravka = new PriorityQueue<>(standart);

        zapravka.offer(new Transport(9,9, 9, "Легковой автомобиль 1"));
        zapravka.offer(new Transport(9,9, 9,"Легковой автомобиль 2"));
        zapravka.offer(new Transport(9,9, 9,"Легковой автомобиль 3"));
        zapravka.offer(new Transport(0,1, 2,"Скорая помощь"));
        zapravka.offer(new Transport(9,2, 9,"Автобус"));
        zapravka.offer(new Transport(9,9, 1,"Технологический транспорт городских служб "));

        while (!zapravka.isEmpty()){
            System.out.println(zapravka.poll());
    }
        System.out.println();
        //zapravka = new PriorityQueue<>(Comparator.);

        zapravka.add(new Transport(9,9, 9, "Легковой автомобиль 1"));
        zapravka.add(new Transport(9,9, 9,"Легковой автомобиль 2"));
        zapravka.add(new Transport(9,9, 9,"Легковой автомобиль 3"));
        zapravka.add(new Transport(0,1, 2,"Скорая помощь"));
        zapravka.add(new Transport(9,2, 9,"Автобус"));
        zapravka.add(new Transport(9,9, 1,"Технологический транспорт городских служб "));

        while (!zapravka.isEmpty()){
            System.out.println(zapravka.remove());
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
