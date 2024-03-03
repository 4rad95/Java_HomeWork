package org.example.HW_13_270224.task2;

//
//2) У вас есть приют для животных, в которых живут коты.
//Есть объект Cat с данными: имя, возраст, вес, порода.
//
//
//
//        создайте Map, ключом которого будет имя, а значением объект Cat.
//
//информация о котах должна храниться в упорядоченном виде по имени.
//
//выведите имена котов, порода которых равна N (на ваше усмотрение).
//
//выведите список всех котов, вес которых больше значения М (на ваше усмотрение).
//
//        * найдите кота с самым большим весом и возрастом одновременно.

import java.util.*;

public class CatHouse {
    public static void main(String[] args) {

        Map<String,Cat> catHouse = new TreeMap<>();

        addEntryToMap(new Cat("Vaska",2,2,"N"),catHouse);
        addEntryToMap(new Cat("Murka",3,3,"N"),catHouse);
        addEntryToMap(new Cat("Barsik",5,8,"M"),catHouse);
        addEntryToMap(new Cat("Joy",6,7,"M"),catHouse);
        addEntryToMap(new Cat("Jack",4,6,"M"),catHouse);

        System.out.println();
        System.out.println( "Информация о котах должна храниться в упорядоченном виде по имени. Проверили");
        System.out.println();
        for (Map.Entry<String, Cat> entry : catHouse.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println();
        System.out.println( "Выведите имена котов, порода которых равна N (на ваше усмотрение).");
        System.out.println();

        for (Map.Entry<String, Cat> entry : catHouse.entrySet()) {
            if (entry.getValue().type == "N") {
            System.out.println(entry.getValue());
        }}

        System.out.println();
        System.out.println( "Выведите список всех котов, вес которых больше значения М (на ваше усмотрение).");
        System.out.println();

        for (Map.Entry<String, Cat> entry : catHouse.entrySet()) {
            if (entry.getValue().weight > 4) {
                System.out.println(entry.getValue());
            }}

        System.out.println();
        System.out.println( "Найдите кота с самым большим весом и возрастом одновременно.");
        System.out.println();

        String nameMaxAge = null;
        int maxAge = 0;
        String nameMaxWeight = null;
        int maxWeight = 0;
        String nameMaxAgeWeight = null;
        int maxAgeWeight = 0;

        for (Map.Entry<String, Cat> entry : catHouse.entrySet()) {
            if (entry.getValue().weight > maxWeight) {
                nameMaxWeight = entry.getKey();
                maxWeight = entry.getValue().weight;
            }
            if (entry.getValue().age > maxAge) {
                nameMaxAge = entry.getKey();
                maxAge = entry.getValue().age;
            }
            if (entry.getValue().age*entry.getValue().weight>maxAgeWeight) {
                nameMaxAgeWeight = entry.getKey();
                maxAgeWeight = entry.getValue().age*entry.getValue().weight;
            }
        }
        System.out.println("Самый толстый " + nameMaxWeight);
        System.out.println("Самый опытный " + nameMaxAge);
        System.out.println("Самый толстоОпытный " + nameMaxAgeWeight);

    }

    public static String addEntryToMap(Cat cat, Map<String, Cat> catHouse) {
        catHouse.put(cat.name,cat);
        return cat.name;
    }

}
