package org.example.HW_09_130224.task1;

public class task1 {
    public static void main(String[] args) {

//        1 уровень сложности: 1. В стране Лимпопо количество всех зверей равно 10 миллионов.
//                Рождаемость составляет 14 зверей на 1000, смертность - 8 зверей.
//                Рассчитайте, сколько зверей будет через 10 лет, принимая во внимание,
//                что показатели рождаемости и смертности постоянны.

        //   Вот только не понятно как сюда итераторы притянуть?

        animalCount(10,1000000);

        //  Решение с учетом концепции ООП  )))))

        AnimalPopulation animalPopulation = new AnimalPopulation(10000000,2024);
        animalPopulation.statistic(10);

    }

       public static void  animalCount(int yard, int count) {

           System.out.println();

           for (int i = 1; i <= 10 ; i++) {
               count = count + 14*(count/1000)-8;
               System.out.println( i + " год  : " + count +" животных. ");
        }
           System.out.println();
    }

}
