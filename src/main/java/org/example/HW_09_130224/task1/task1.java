package org.example.HW_09_130224.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class task1 {
    public static void main(String[] args) {

//        1 уровень сложности: 1. В стране Лимпопо количество всех зверей равно 10 миллионов.
//                Рождаемость составляет 14 зверей на 1000, смертность - 8 зверей.
//                Рассчитайте, сколько зверей будет через 10 лет, принимая во внимание,
//                что показатели рождаемости и смертности постоянны.

        //   Вот только не понятно как сюда итераторы притянуть? Но Юля подсказала!

        animalCount(10,1000000);

        //  Решение с учетом концепции ООП  )))))

        AnimalPopulation animalPopulation = new AnimalPopulation(10000000,2024);
        animalPopulation.statistic(10);

        System.out.println();

        animalCountList(10,10000000);
    }

       public static void  animalCount(int yard, int count) {

           System.out.println();

           for (int i = 1; i <= 10 ; i++) {
               count = count + 14*(count/1000)-8;
               System.out.println( i + " год  : " + count +" животных. ");
        }
           System.out.println();
    }
    public static void animalCountList(int year, int count) {
        List<Integer> countAnimal = new ArrayList();
        for (int i = 0; i < count; i++) {
            countAnimal.add(1);
        }
        int count1000=0;
        for (int j = 0; j < year; j++) {
            ListIterator<Integer> itr = countAnimal.listIterator();
            while (itr.hasNext()) {
                for (int i = 1; i < 1000; i++) {
                    if (!itr.hasNext()) {
                        break;
                    }
                    itr.next();
                }
            count1000+=1;
            }

            for (int i = 0; i < 8; i++) {
                itr.previous();
                itr.remove();
            }
            for (int i=0; i< (14*count1000) ;i++) {
                itr.add(1);
            }
            count1000=0;
            itr = countAnimal.listIterator();
            System.out.println("Iterator Used: Год "+(j+1) +" Животных :"+ countAnimal.size());
        }

    }
    }


