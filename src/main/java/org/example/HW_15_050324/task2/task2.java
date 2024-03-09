package org.example.HW_15_050324.task2;

import java.util.Arrays;
import java.util.List;

public class task2 {

    // 2) Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")
    public static void main(String[] args) {

        System.out.println();
        List<String> list = Arrays.asList("a1", "b5", "a2", "b4");
        System.out.println("Самый маленький элемент: "+list.stream().min(Comparable<String>::compareTo));
    }
}
