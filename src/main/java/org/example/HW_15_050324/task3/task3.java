package org.example.HW_15_050324.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class task3 {
//    3) Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
//            Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

    public static void main(String[] args) {

        List<String> list =  Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        list.stream().distinct()
                .sorted(Comparator
                .reverseOrder())
                .forEach(System.out::println);
    }
}
