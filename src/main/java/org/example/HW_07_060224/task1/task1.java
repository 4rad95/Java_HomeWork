package org.example.HW_07_060224.task1;

import java.util.Arrays;

// 1 уровень сложности: 1) У вас есть класс DynamicIntArray. Внутри него есть 3 характеристики:
//
//
//int lenght(реальный размер хранимых данных),
//
//int capacity(размер массива),
//
//массив int размером capacity (arr[capacity]),
//константы:
//
//начальный размер массива по умолчанию (DEFAULT_CAPACITY),
//
//% изменения размера массива при автоматическом увеличениию (PROCENT_CHANGE).
//Реализуйте 2 конструктора:
//
//по умолчанию (создается массив arr размером DEFAULT_CAPACITY)
//
//с параметром capacity (создается массив arr размер которого передается параметром  capacity).
//Реализуйте методы:
//
//add(int element) - добавление элемента в конец (не забывайте про ограничения размера массива).
//
//add(int[] elements) - добавление массива элементов в конец нашего массива(не забывайте про ограничения размера массива).
//
//insert (int index, int element) - вставка элемента в место с нужным индексом (не забывайте про ограничения размера массива
//        и смещение элементов вправо)
//
//delete (int index) - удаление элемента (не забывайте про смещение элементов влево при операции).
//
//get(int index) - вернуть значение элемента по index
public class task1 {
    public static void main(String[] args) {

        DynamicIntArray array = new DynamicIntArray();
        System.out.println(array.toString());

        for (int i = 0; i < 20; i++) {
            array.add(i);
            System.out.println(array.toString());
        }
        int[] addArray = {1,2,3,4,5};
        array.add(addArray);

        System.out.println(array.toString());
        array.insert(20,0);
        System.out.println(array.toString());
        array.delete(15);
        System.out.println(array.toString());
        System.out.println("Заданый  елемент = " + array.get(18));
    }
    // А Вот зачем нужно два конструктора? Я не понял.

}
