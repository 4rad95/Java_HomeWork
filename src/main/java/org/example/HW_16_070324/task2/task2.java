package org.example.HW_16_070324.task2;
//// Задача 1: Фильтрация четных чисел и умножение на 2.
//// Задача 2: Удаление дубликатов из списка строк.
//// Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
//// Задача 4: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.
//// Задача 5: Пропуск первых двух элементов и вывод оставшихся.
//// Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.
//// Задача 7: Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.
//// Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.
//// Задача 9: Получить среднее значение чисел в списке.
//// Задача 10: Получить строку, объединяющую элементы списка через запятую.
//// Задача 11: Получить список квадратов чисел из другого списка.
//// Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке.
//// Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.
//// Задача 14: Пропустить первые 2 элемента и оставить только уникальные.
//// Задача 15: Фильтрация и сортировка пользователей по возрасту.
//class User {
//    private String name;
//    private int age;
//
//
//    public User(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//}
//

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java.util.stream.IntStream;

public class task2 {
    public static void main(String[] args) {


        List<Integer> integerList = List.of(1,2,3,4,5,7,8,9,32,12,24,53,67,72);
        List<String>  stringList  = List.of("1","2","4","5","9","12");
        List<String>  stringList1 = List.of("b1","a2","c4","a5","c9","b12","a2","c4");
        List<String>  strings     = List.of("On the ceiling of the lantern, which rises above the highest part",
                "Af the dome, is a painting of a beautiful female figure",
                "of the dome, is a painting of a beautiful female figure",
                "of the dome, is a painting of a beautiful female figure",
                "representing Human Understanding, in the act of lifting the veil",
                "representing Human Understanding, in the act of lifting the veil",
                "Aepresenting Human Understanding, in the act of lifting the veil");

//// Задача 1: Фильтрация четных чисел и умножение на 2.

        System.out.println();
        System.out.print("Задача 1: Фильтрация четных чисел и умножение на 2.  :  ");
        integerList.stream()
                .filter(x->x%2==0)
                .map(x->x*2)
                .map(x->x+" ")
                .forEach(System.out::print);
        System.out.println();
        System.out.println();

//// Задача 2: Удаление дубликатов из списка строк.

        System.out.println("Задача 2: Удаление дубликатов из списка строк.");
        System.out.println();
        strings.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

//// Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.

        System.out.println(" Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.");
        System.out.println();
        integerList.stream()
                .sorted((a,b) ->b-a)
                .limit(3)
                .map( x-> x + " ")
                .forEach(System.out::print);
        System.out.println();
        System.out.println();

//// Задача 4: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.

        System.out.println("Задача 4: Фильтрация строк, начинающихся на 'A' и преобразование в верхний регистр");
        System.out.println();
        strings.stream().filter(str ->str.charAt(0)=='A')
                        .map(x ->x.toUpperCase()).forEach(System.out::println);
        System.out.println();

//// Задача 5: Пропуск первых двух элементов и вывод оставшихся.

        System.out.println("Задача 5: Пропуск первых двух элементов и вывод оставшихся.");
        System.out.println();
        stringList1.stream().skip(2).map(x-> x+" ").forEach(System.out::print);
        System.out.println();

//// Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.

        System.out.println("Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.");
        System.out.println();
        integerList.stream().filter(x -> x>50).map(x -> x*x).map(x -> x+ " ").forEach(System.out::print);
        System.out.println();

//// Задача 7: Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.

        System.out.println("Задача 7: Оставить только слова, содержащие букву \"o\" и вывести их в обратном порядке.");
        System.out.println();

        List<String>  filterWords =strings.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .filter(word -> word.contains("o"))
                .collect(Collectors.toList());
        Collections.reverse(filterWords);
        System.out.println(filterWords);

        System.out.println();

//// Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.

    System.out.println(" Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.");
    System.out.println();
    integerList.stream().filter(x -> x%2 == 0).sorted((a,b)-> a-b ).map(x->x+" "). forEach(System.out::print);
    System.out.println();
    System.out.println();


//// Задача 9: Получить среднее значение чисел в списке.

        System.out.println("  Задача 9: Получить среднее значение чисел в списке.");
        System.out.println();
        //System.out.println(
        System.out.println("Среднее значение = "+integerList.stream().mapToDouble(Integer::doubleValue).average().getAsDouble());

        System.out.println();

//// Задача 10: Получить строку, объединяющую элементы списка через запятую.

        System.out.println("Задача 10: Получить строку, объединяющую элементы списка через запятую.");
        System.out.println();
        stringList1.stream().map(x->x+",").forEach(System.out::print);
        System.out.println();
        System.out.println();


//// Задача 11: Получить список квадратов чисел из другого списка.

        System.out.println("Задача 11: Получить список квадратов чисел из другого списка.");
        System.out.println();
        integerList.stream().map(x->x*x+" ").forEach(System.out::print);
        System.out.println();
        System.out.println();

//// Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке.

        System.out.println("Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке.");
        System.out.println();
        System.out.println(strings.stream().flatMap(word ->word.chars().mapToObj(ch->(char)ch)).distinct().sorted().collect(Collectors.toList()));

        System.out.println();
        System.out.println();

//// Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.
        System.out.println("Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.");
        System.out.println();
        strings.stream()
                .limit(3)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println();
//// Задача 14: Пропустить первые 2 элемента и оставить только уникальные.

        System.out.println("Задача 14: Пропустить первые 2 элемента и оставить только уникальные.");
        System.out.println();
        stringList1.stream().skip(2).distinct().map(x-> x+" ").forEach(System.out::print);
        System.out.println();
        System.out.println();
//// Задача 15: Фильтрация и сортировка пользователей по возрасту.

        System.out.println("Задача 15: Фильтрация и сортировка пользователей по возрасту.");
        System.out.println();
        List<User> userList = List.of(new User("John",22),
                new User("Jack",32),
                new User("Nick",31),
                new User("Serj",23) );

        System.out.println();
        userList.stream()
                .filter( x -> x.getAge()>25)
                .sorted(Comparator.comparingInt(User::getAge))
                .forEach(System.out::println);
    }
}
