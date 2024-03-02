package org.example.HW_13_270224.task1;

// 1 уровень сложности: 1) Есть Map, в котором храниться количество жителей по разным городам.

//Найдите город с самым большим количеством жителей.
//
//Найдите среднее количество жителей по всем городам.
//
//Найдите все города, у которых количество жителей одинаковое.

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class City {
    public static void main(String[] args) {

        Map<String,Integer> cityMap =  new TreeMap<>();


        cityMap.put("Berlin", 2000000);
        cityMap.put("London",1880900);
        cityMap.put("Madrid",1200000);
        cityMap.put("Dublin",250000);
        cityMap.put("Barselona",1200000);


        String city = "";
        int totalPopulation  = 0;
        int maxPeople = 0;
        int count = 0;

        for (Map.Entry<String, Integer> entry : cityMap.entrySet()){
            System.out.println(entry);
            if (entry.getValue()>maxPeople){
                city = entry.getKey();
                maxPeople = entry.getValue();
            }
            maxPeople += entry.getValue();
            count++;
            for (Map.Entry<String, Integer> entry1 : cityMap.entrySet()) {
                String city1 = entry1.getKey();
                int populationTemp = entry1.getValue();
                if ((entry.getValue() == populationTemp) && (entry.getKey() != city1)) {

                    System.out.println("Одинаковое к-во жителей в городах " + entry + " и " + entry1);
                }
            }
            }

        System.out.println();
        System.out.println("Наибольшее количество жителей в " + city + " и составляет " + maxPeople + " жителей");
        System.out.println("Среднее количество жителей в городе  = " +maxPeople/count);
    }
}
