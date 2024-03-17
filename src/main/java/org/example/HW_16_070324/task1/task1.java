package org.example.HW_16_070324.task1;

import org.example.HW_15_050324.task4.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task1 {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3,4,5,7,8,9,32,12,24);
        List<String>  stringList  = List.of("1","2","4","5","9","12");
        List<String>  stringList1 = List.of("b1","a2","c4","a5","c9","b12");
        List<String>  strings     = List.of("On the ceiling of the lantern, which rises above the highest part",
                                            "of the dome, is a painting of a beautiful female figure",
                                            "representing Human Understanding, in the act of lifting the veil");

//Задание 1: Фильтрация списка целых чисел на нечетные числа

        System.out.print("Четные : ");
        integerList.stream().filter(x-> x % 2 ==0 ).forEach(x -> System.out.print(x + " "));  // X
        System.out.println();
        System.out.print("Не четные : ");
        integerList.stream().filter(x-> x % 2 !=0 ).forEach(x -> System.out.print(x + " "));  // X

//Задание 2: Преобразование списка строк в список чисел

        System.out.println();
        System.out.print("Ряд чисел : ");
        stringList.stream()
                .mapToInt(x -> Integer.parseInt(x))
                .forEach(x-> System.out.print( x + " "));
        System.out.println();

//Задание 3: Суммирование списка чисел

        System.out.println("Сумма всех чисел  : " + integerList.stream()
                                                    .reduce(0, (x,y) -> x+y));

//Задание 4: Определение максимального значения в списке

        // Для списка чисел
        System.out.println("Максимальный элемент (int): "+integerList.stream().max(Comparable<Integer>::compareTo));

        // Для списка стрингов
        System.out.println("Максимальный элемент  (String): "+stringList1.stream().max(Comparable<String>::compareTo));

//Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр

        System.out.print("Элементы начинаються на 'a' : ");
        stringList1.stream().filter( x ->  x.charAt(0) == 'a').map(x ->x.toUpperCase() +" ").forEach(System.out::print);
        System.out.println();

//Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов

        System.out.print("Слова более 4-ех букв, уникальные : ");
        strings.stream().distinct()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .filter(x -> x.length()>4)
                .map(x -> x+" ")
                .forEach(System.out::print);
        System.out.println();

//Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------

List<User> userList = List.of(new User("John",22),
                        new User("Jack",32),
                        new User("Nick",31),
                        new User("Serj",23) );
        System.out.println();
        userList.stream().sorted(Comparator.comparingInt(User::getAge)).forEach(System.out::println);

//Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
        System.out.println();
        System.out.println("Cуммы чисел, кратных 3 и 5, из списка чисел : " + integerList.stream()
                            .filter(x ->((x%3==0)||(x%5==0)))
                            .reduce(0,(a,b)->a+b));

//Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк

        System.out.println();

        List<String> uniqueWords = strings.stream()
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueWords);

    }
}

