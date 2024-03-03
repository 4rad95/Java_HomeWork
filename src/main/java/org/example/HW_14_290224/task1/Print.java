package org.example.HW_14_290224.task1;

// 1 уровень сложности: 1) Написать функциональный интерфейс Printable, который содержит один метод void print(String text).
//Используя этот интерфейс, напишите lambda выражения для печати переданного текста большими буквами,
//и маленькими буквами.
//Возможно ли данный интерфейс заменить одним из стандартных функциональных интерфейсов?
//        Если да, приведите пример.

import java.util.function.Consumer;



public class Print {
    public static void main(String[] args) {

        System.out.println();
        MyVoid myVoid = (str) -> System.out.println(str.toUpperCase());
        myVoid.print("Используя этот интерфейс, напишите lambda выражения для печати переданного текста большими буквами,");
        System.out.println();
        Consumer<String> print = (string) -> System.out.println(string.toLowerCase());
        print.accept("ИСПОЛЬЗУЯ ЭТОТ ИНТЕРФЕЙС, НАПИШИТЕ LAMBDA ВЫРАЖЕНИЯ ДЛЯ ПЕЧАТИ ПЕРЕДАННОГО ТЕКСТА БОЛЬШИМИ БУКВАМИ,");
    }

}
@FunctionalInterface
interface MyVoid {
    void print(String string);
}

//class Class implements MyVoid {
//
//    @Override
//    public void print(String string) {
//        System.out.println("Print this str" + string.toUpperCase());
//    }

//}
