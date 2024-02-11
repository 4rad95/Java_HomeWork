package org.example.HW_08_080224;

import java.util.ArrayList;
import java.util.Random;

public class Part_4_5_6 {
    public static void main(String[] args) {
        //
//        4)
//Перебрать ArrayList и найти сумму квадратов всех элементов.
//Перебрать ArrayList и найти самую короткую строку.
//Перебрать ArrayList и заменить все гласные буквы в каждой строке на символ ''.
//
//
//        5*)
//Перебрать ArrayList и найти второй по величине элемент.
//Перебрать ArrayList и вывести все элементы в обратном порядке.
//Перебрать ArrayList и вывести все строки, содержащие только буквы.
//Перебрать ArrayList и найти самую длинную строку, не содержащую пробелов.
//Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
//
//
//        6*)
//Перебрать ArrayList и найти наибольшую возрастающую последовательность элементов.
//Перебрать ArrayList и удалить все дубликаты элементов.
//Перебрать ArrayList и создать новый список, содержащий только уникальные строки.
//Перебрать ArrayList и объединить все строки в одну с использованием разделителя.

        ArrayList<MyObject> list = new ArrayList<>();
        list.add(new MyObject("Иван", 25));
        list.add(new MyObject("Петр", 30));
        list.add(new MyObject("Василиса", 35));
        list.add(new MyObject("Кондрат", 41));
        list.add(new MyObject("Сержио", 29));
        list.add(new MyObject("Павел", 55));
        list.add(new MyObject("Петр", 30));
        list.add(new MyObject("Василиса", 35));

        java.util.ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            arrayListInteger.add(rn.nextInt(50));
        }
//        4)
//Перебрать ArrayList и найти сумму квадратов всех элементов.
        {
            System.out.println();
            System.out.println("  Перебрать ArrayList и найти сумму квадратов всех элементов.");
            int sum = 0;
            System.out.print("Все елементы нашего ArrayLista = { ");
            for (Integer i : arrayListInteger) {
                sum+=i*i;
                System.out.print( i + " ");
            }
            System.out.println(" }" );
            System.out.println("Сумма квадратов нашего ArrayLista = "+ sum);
        }
//Перебрать ArrayList и найти самую короткую строку.
        {
            System.out.println();
            System.out.println("Перебрать ArrayList и найти самую короткую строку.");
            String shortest = list.get(0).getName();
            for (MyObject myObject : list) {
                if (myObject.getName().length() < shortest.length()) {
                    shortest = myObject.getName();
                }
            }
            System.out.println("Самое короткое имя : " + shortest+ ". "+ shortest.length() + " знака." );
        }
        {
//Перебрать ArrayList и заменить все гласные буквы в каждой строке на символ ''.
            System.out.println();
            System.out.println("Перебрать ArrayList и заменить все гласные буквы в каждой строке на символ ''.");
            for (MyObject myObject : list) {
                myObject.setName(myObject.getName().replaceAll("[аАоОуУеЕиИэЭыЫ]"," "));
            }
            for (MyObject object : list) {
                System.out.println(object);
            }
        }
        //        5*)
        //Перебрать ArrayList и найти второй по величине элемент.
        {
            System.out.println();
            System.out.println("Перебрать ArrayList и найти второй по величине элемент.");
            int max = arrayListInteger.get(0);
            int maxSecond =Integer.MIN_VALUE;
            for (Integer i : arrayListInteger) {
                if (max < i) {
                    maxSecond = max ;
                    max = i;
                } else if (i > maxSecond) {
                    maxSecond = i;
                }
            }

            System.out.println("Максимальный елемент : " + max);
            System.out.println("Перебрать ArrayList и найти второй по величине элемент :" + maxSecond);
        }


//Перебрать ArrayList и вывести все элементы в обратном порядке.
        {
            System.out.println();
            System.out.println("Перебрать ArrayList и вывести все элементы в обратном порядке.");
            System.out.println("Наш ArrayList" + arrayListInteger.toString());
            System.out.print("Наш ArrayList в обратном порядке { ");
            for (int i=arrayListInteger.size()-1; i>=0;i--) {
                System.out.print(arrayListInteger.get(i)+" ");
            }
            System.out.println(" }");
        }


            ArrayList<String> listString = new ArrayList<>();
            listString.add("Маша купила мороженое.");
            listString.add("Паша разбил 3 окна.");
            listString.add("рентгеноэлектрокардиографического");
            listString.add("Маша купила мороженое.");
            listString.add("Машакупиламороженое.");
            listString.add("Таня вымыла 2  тарелки.");
            listString.add("Таня вымыла 2  тарелки.");
            listString.add("Антон хороший человек.");

    //Перебрать ArrayList и вывести все строки, содержащие только буквы.

            System.out.println();
            System.out.println("Перебрать ArrayList и вывести все строки, содержащие только буквы (пробелы и знаки препинания).");
            for (String str : listString) {
                if(str.matches("[а-яА-Я.,:; ]+")) {
                    System.out.println(str);
                }
            }

//Перебрать ArrayList и найти самую длинную строку, не содержащую пробелов.
            System.out.println();
            System.out.println("Перебрать ArrayList и найти самую длинную строку, не содержащую пробелов.");
            String longest = "";
            for (String string:listString) {
                if (string.split(" ").length == 1 && string.length() > longest.length()) {
                    longest = string;
                }
            }
            System.out.println("Самая длинная строка, не содержащая пробелов : " + longest);



//Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
        {
            System.out.println();
            System.out.println("Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.");
            ArrayList<MyObject> uniqueObjects = new ArrayList<>();
            for (MyObject myObject : list) {
                if (!uniqueObjects.contains(myObject)) {
                    uniqueObjects.add(myObject);
                }
            }

            for (MyObject object : uniqueObjects) {
                System.out.println(object.toString());
            }
        }
        //        6*)
//Перебрать ArrayList и найти наибольшую возрастающую последовательность элементов.

        {
            System.out.println();
            System.out.println("Перебрать ArrayList и найти наибольшую возрастающую последовательность элементов.");
            int maxLen = 1;
            int maxResult=0;
            int start = 0;
            int startResult = 0;
            for (int i = 0; i < list.size(); i++) {
                if (arrayListInteger.get(i) < arrayListInteger.get(i + 1)) {
                    maxLen+=1;

                    if ((i  == list.size()-1) && (maxResult < maxLen)) {
                        maxResult = maxLen;
                        startResult = start;
                    }
                } else {
                    if (maxResult < maxLen) {
                            maxResult = maxLen;
                            startResult = start;
                    }
                    start = i+1;
                    maxLen = 1;
                }
            }
            System.out.println("Наш ArrayList" + arrayListInteger.toString());
            System.out.print("Наибольшую возрастающую последовательность с " + (startResult +1)+ " элемента,  элементов : "+ maxResult + " { ");
            for (int i = startResult; i < startResult + maxResult; i++) {
                System.out.print(arrayListInteger.get(i)+ " ");
            }
            System.out.println(" }");
        }
//Перебрать ArrayList и удалить все дубликаты элементов.
        {
            System.out.println();
            System.out.println("Перебрать ArrayList и удалить все дубликаты элементов.");
            ArrayList<MyObject> uniqueObjects = new ArrayList<>();
            for (MyObject myObject : list) {
                if (!uniqueObjects.contains(myObject)) {
                    uniqueObjects.add(myObject);
                }
            }
            list.clear();

            for (MyObject myObject : uniqueObjects) {
                list.add(myObject);
            }

            for (MyObject myObject : list) {
                System.out.println(myObject);
            }
        }
//Перебрать ArrayList и создать новый список, содержащий только уникальные строки.
        {
            System.out.println();
            System.out.println("СПеребрать ArrayList и создать новый список, содержащий только уникальные строки.");
            ArrayList<String> uniqueString = new ArrayList<>();
            for (String string : listString) {
                if (!uniqueString.contains(string)) {
                    uniqueString.add(string);
                }
            }

            for (String string : uniqueString) {
                System.out.println(string);
            }
        }
//Перебрать ArrayList и объединить все строки в одну с использованием разделителя.
        System.out.println();
        System.out.println("Перебрать ArrayList и объединить все строки в одну с использованием разделителя. (||)");
        String stringOut = "";
        for (String string : listString) {
                stringOut += "||"+string;
        }
        System.out.println(stringOut);
    }
}
