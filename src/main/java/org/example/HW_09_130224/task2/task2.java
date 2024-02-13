package org.example.HW_09_130224.task2;

import java.util.*;

public class task2 {
    public static void main(String[] args) {

//        2*. -  создать лист, наполнить его 10 млн.элементов

//        внутри тела просто будем присваивать i-тый элемент в переменную temp
//
//        перебрать весь список и замерять время выполнения:
//        а) с помощью for-each loop
//        b) классический for, с выполнением условия i<list.size()
//        c) классический for, но проходим список с конца до начала (i--)
//        d) используя Itertor
//        e) используя ListIterator и перемещаясь от начала списка до конца
//        e) используя ListIterator с перемещением от конца списка к началу
//        Замер производительности делать для каждого из подпунктов отдельно,
//        используя например сходный шаблон кода:  инструкцию java:
//        long startTime = System.currentTimeMillis();
//        //…… Ваша реализация перебора списка, например
//        for (int i : list) {
//            int temp = i;
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("for-each loop: " + (endTime - startTime));
//        время выполнения каждого перебора вывести в консоль
//        Определите, какой вариант перебора списка работает быстрее всего.


        //  Для точности измерения делаем  массив array[6] Запускаем 10 раз и берем среднее.

        List<Integer> list = new ArrayList<>();
        long[] array = new long[6];

        int temp;
        for (int i = 0; i < 10000000; i++) {
                list.add(i);
        }
        System.out.println();
        for (int j = 0; j <10 ; j++) {
            System.out.println();
            System.out.println((j+1) +"  раз ");
            System.out.println();

        {  // с помощью for-each loop

            long startTime = System.currentTimeMillis();
            for (Integer i : list) {
                temp = i;
            }
            long endTime = System.currentTimeMillis();
            array[0] += (endTime - startTime);
            System.out.println((endTime - startTime) + "  for-each loop. " );
        }
        { // классический for, с выполнением условия i<list.size()
            long startTime = System.currentTimeMillis();

            for (int i = 0; i < list.size() ; i++) {
                temp = i;
            }
            long endTime = System.currentTimeMillis();
            array[1] += (endTime - startTime);
            System.out.println((endTime - startTime) + "   классический for. " );
        }
        { // классический for, но проходим список с конца до начала (i--)
            long startTime = System.currentTimeMillis();

            for (int i = list.size(); i > 0 ; i--) {
                temp = i;
            }
            long endTime = System.currentTimeMillis();
            array[2] += (endTime - startTime);
            System.out.println( (endTime - startTime) + "   классический for в обратном порядке. " );
        }
        { // классический for, но проходим список с конца до начала (i--)
            long startTime = System.currentTimeMillis();
            Iterator<Integer> itr = list.iterator();
            while (itr.hasNext()){
                     temp = itr.next();
            }
            long endTime = System.currentTimeMillis();
            array[3] += (endTime - startTime);
            System.out.println( (endTime - startTime) + "  Iterator.  " );
        }

        {//        e) используя ListIterator и перемещаясь от начала списка до конца

            long startTime = System.currentTimeMillis();
            ListIterator<Integer> itr = list.listIterator();
            while (itr.hasNext()){
                temp = itr.next();
            }
            long endTime = System.currentTimeMillis();
            array[4] += (endTime - startTime);
            System.out.println( (endTime - startTime) + "  LListIterator и перемещаясь от начала списка до конца" );

        //        e) используя ListIterator с перемещением от конца списка к началу

            startTime = System.currentTimeMillis();

            while (itr.hasPrevious()){
                temp = itr.previous();
            }
            endTime = System.currentTimeMillis();
            array[5] += (endTime - startTime);
            System.out.println( (endTime - startTime) + "  ListIterator с перемещением от конца списка к началу  " );

        }
            System.out.println();

            System.out.println("Всего "+array[0]+"мс, среднее: "+ (array[0]/10)+ "  помощью for-each loop");
            System.out.println("Всего "+array[1]+"мс, среднее: "+ (array[1]/10)+ "  классический for, с выполнением условия i<list.size())");
            System.out.println("Всего "+array[2]+"мс, среднее: "+ (array[2]/10)+ "  классический for, но проходим список с конца до начала (i--)");
            System.out.println("Всего "+array[3]+"мс, среднее: "+ (array[3]/10)+"   используя Itertor ");
            System.out.println("Всего "+array[4]+"мс, среднее: "+ (array[4]/10)+"   используя ListIterator и перемещаясь от начала списка до конца");
            System.out.println("Всего "+array[5]+"мс, среднее: "+ (array[5]/10)+"   используя ListIterator с перемещением от конца списка к началу");
    }}
}
