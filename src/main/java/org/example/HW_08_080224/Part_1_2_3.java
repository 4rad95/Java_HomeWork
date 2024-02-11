package org.example.HW_08_080224;

import java.util.ArrayList;
import java.util.Random;
//         1)
//Найти сумму всех элементов ArrayList.
//Перебрать ArrayList и вывести все элементы на экран.
//Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
//
//        2)
//Перебрать ArrayList и найти наименьший элемент.
//Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
//Создать ArrayList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
//
//
//3*)
//Перебрать ArrayList и удалить все четные числа.
//Перебрать ArrayList и объединить все элементы в одну строку.
//Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.

public class Part_1_2_3 {
    public static void main(String[] args) {


        java.util.ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            arrayListInteger.add(rn.nextInt(50));
        }
        {
            //Найти сумму всех элементов ArrayList.
            //Перебрать ArrayList и вывести все элементы на экран.

            System.out.println();
            System.out.println(" Найти сумму всех элементов ArrayList. Перебрать ArrayList и вывести все элементы на экран.");

            int sum = 0;
            System.out.print(" Все елементы нашего ArrayLista = { ");
            for (int i : arrayListInteger) {
                sum += i;
                System.out.print(i + " ");
            }
            System.out.println("}");
            System.out.println("ArrayList со случайными числами " + arrayListInteger.toString() + "  Сумма элементов = " + sum);
        }

        //Создать ArrayList с объектами вашего собственного класса и вывести их на экран.

        System.out.println();
        System.out.println("Создать ArrayList с объектами вашего собственного класса и вывести их на экран.");
        ArrayList<MyObject> list = new ArrayList<>();
        list.add(new MyObject("Иван", 25));
        list.add(new MyObject("Петр", 30));
        list.add(new MyObject("Василий", 35));
        list.add(new MyObject("Кондрат", 41));
        list.add(new MyObject("Сержио", 29));
        list.add(new MyObject("Павел", 55));

        {
            for (MyObject object : list) {
                System.out.println(object);
            }
        }

//        2)
//Перебрать ArrayList и найти наименьший элемент.
//Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
//Создать ArrayList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
//
        {
            System.out.println();
            System.out.println("Перебрать ArrayList и найти наименьший элемент.");
            int min = Integer.MAX_VALUE;

            for (int i : arrayListInteger) {
                if (min > i) {
                    min = i;
                }
            }

            System.out.println("ArrayList со случайными числами " + arrayListInteger.toString() + "  Минимальный элемент = " + min);
        }
//Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.

        {
            System.out.println();
            System.out.println("Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.");
            int count = 0;
            char letter = 'П';
            for (MyObject myObject : list) {
                if (myObject.getName().charAt(0) == letter) {
                    count++;
                }
            }
            System.out.println("Елементов где имя начинается  на букву П " + count + " штук");
        }
//Создать ArrayList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.

        {
            System.out.println();
            System.out.println("Создать ArrayList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию. (возраст > 50 лет).");
            list.removeIf(object -> object.getAge() > 50);
        }
        System.out.println("Удаляем елементы где возраст более 50 лет");
        for (MyObject myObject : list) {
            System.out.println(myObject);
        }

//Перебрать ArrayList и удалить все четные числа.
//Перебрать ArrayList и объединить все элементы в одну строку.
//Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.

        System.out.println();
        System.out.println("Перебрать ArrayList и удалить все четные числа.");
        arrayListInteger.removeIf(element -> element % 2 == 0);
        System.out.println("ArrayList с удаленными четными числами " + arrayListInteger.toString());


    {
        System.out.println();
        System.out.println("Перебрать ArrayList и объединить все элементы в одну строку.");
        String str = "";
        for (MyObject myObject : list) {
            str += myObject.getName() + " " + myObject.getAge()+" ";
        }
        System.out.println("Все елемнты в одну строку : " + str);
    }
    {
        System.out.println();
        System.out.println("Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию. (Возраст >33 лет)");
        for (MyObject myObject : list) {
            if (myObject.getAge()>33){
                System.out.println(myObject);
            }

        }
    }

}}