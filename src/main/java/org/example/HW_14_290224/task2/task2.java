package org.example.HW_14_290224.task2;

//Создать лямбда выражение, которое возвращает значение true,
//если строка не null, используя функциональный интерфейс Predicate.
//
//Создать лямбда выражение, которое проверяет, что строка не пуста,
//используя функциональный интерфейс Predicate.
//
//Написать программу проверяющую, что строка не null и не пуста,
//используя функциональный интерфейс Predicate.
//
//        Написать программу, которая проверяет, что строка начинается буквой “J”или “N”
//и заканчивается “A”. Используем функциональный интерфейс Predicate.
//
//Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
//        “Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
//
//Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
//Используем функциональный интерфейс Supplier.


import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class task2 {
    public static void main(String[] args) {

        String stringCorrect = null;
        String stringNotCorrect = "ASD";

        System.out.println();
        System.out.println("Создать лямбда выражение, которое возвращает значение true,");
        System.out.println("если строка не null, используя функциональный интерфейс Predicate.");
        System.out.println();

        {
            Predicate<String> check = (str) -> (str == null);
            System.out.println(stringNotCorrect+" -> "+check.test(stringNotCorrect) + "  "+ stringCorrect+" -> " + check.test(stringCorrect));
        }
        System.out.println();
        System.out.println("Создать лямбда выражение, которое проверяет, что строка не пуста,");
        System.out.println("используя функциональный интерфейс Predicate.");
        System.out.println();
        {
            System.out.println();

            MyVoid myVoid = (str) -> {
                return (str == null);
            };

            System.out.println(stringNotCorrect+" -> "+myVoid.print(stringNotCorrect) + "   " + stringCorrect + " -> " + myVoid.print(stringCorrect));
        }
        System.out.println();
        System.out.println("Написать программу проверяющую, что строка не null и не пуста,");
        System.out.println("используя функциональный интерфейс Predicate.");
        System.out.println();
        {

            Predicate<String> check = (str) -> (str == null || str.length() > 0);
            System.out.println(stringNotCorrect+ " -> "+check.test(stringCorrect) + "  " +stringCorrect + " ->"+ check.test(stringCorrect));
        }

        System.out.println();
        System.out.println( " Написать программу, которая проверяет, что строка начинается буквой 'J' или 'N'");
        System.out.println( "и заканчивается “A”. Используем функциональный интерфейс Predicate.");
        System.out.println();

        {
            stringCorrect = "JofdssA";
            stringNotCorrect = "dsfdsfgsfA";
            Predicate<String> check = (str) ->
                (((str.charAt(0) == 'J' || str.charAt(0)=='N')) && (str.charAt(str.length()-1) == 'A'));

            System.out.println(stringNotCorrect+ " -> "+check.test(stringCorrect) + "  " +stringCorrect + " ->"+ check.test(stringCorrect));
        }
        System.out.println();
        System.out.println("Написать лямбда выражение, которое принимает на вход число и возвращает значение (Положительное число)");
        System.out.println("“Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.");
        System.out.println();
        {
            Function<Integer, String> function = (x) -> {
                if (x > 0 ) {return "Положительное число ";}
                else if (x < 0) {return "Отрицательное число";}
                return "Число ноль";
            };
            System.out.println(" Число  9 -> " + function.apply(9));
            System.out.println(" Число -8 -> " + function.apply(-8));
            System.out.println(" Число  0 -> " + function.apply(0));
        }
        System.out.println();
        System.out.println("Написать лямбда выражение, которое возвращает случайное число от 0 до 10.");
        System.out.println("Используем функциональный интерфейс Supplier.");
        System.out.println();
        {
            Supplier<Integer> supplier = () ->  {
                    Random rm = new Random();
                    return rm.nextInt(10);};

            System.out.println("Случайное число -> " + supplier.get());}
        }

    }




@FunctionalInterface
interface MyVoid {
     boolean print(String string);
}