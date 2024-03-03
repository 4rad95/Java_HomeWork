package org.example.HW_14_290224.task3;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;

//3**) У нас есть профессия в строительстве - чернорабочий. Он может выполнять любые низкоквалифицированные
//работы на стройке. На каждый день ему дается список работ, которые он должен выполнить, но не факт
//что в течении рабочего времени его задание может измениться.
//Напишите программу рабочего дня профессии, которая позволяет динамический давать ему задание на работу,
//в любое нужное время. И он их должен выполнять. Применяйте функциональные интерфейсы.
public class task3 {
    public static void main(String[] args) {


    Map<Integer,String> tasks = new TreeMap<>();

    tasks.put(1,"Копать котлован");
    tasks.put(2,"Розгружать кирпичь");
    tasks.put(3,"Носить цемент");
    tasks.put(4,"Точить лопату");
    tasks.put(5,"Уборка строительного мусора");


    Function<Map.Entry<Integer, String>, String> functionGet = (task) -> task.getValue();
    BiFunction<Map.Entry<Integer, String>, String, String> functionChange = (task, newJob) ->  task.setValue(newJob);

        System.out.println();
        System.out.println("План  работы Иванову: ");
        System.out.println();

        for (Map.Entry<Integer ,String> entry: tasks.entrySet()){
            System.out.println(functionGet.apply(entry));
        }

        Random  rm = new Random();
        System.out.println();
        System.out.println("Рабочий день Иванова: ");
        System.out.println();

    for (Map.Entry<Integer ,String> entry: tasks.entrySet()){
            if (rm.nextInt(10)>7) {
                functionChange.apply(entry, "Разгрузка стройматериалов");
            }
        System.out.println(functionGet.apply(entry));
    }

}}

