package org.example.HW_15_050324.task1;

import java.util.Arrays;
import java.util.List;

public class task1 {

    public static void main(String[] args) {
//        1 уровень сложности: 1) Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
//                Сколько раз объект «Big» встречается в коллекции?

        System.out.println();
        List<String> list = List.of("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        System.out.println("Сколько раз объект «Big» встречается в коллекции? "+ list.stream().filter(x-> x.equals("Big"))
                .count() + " раза ");
    }
}
