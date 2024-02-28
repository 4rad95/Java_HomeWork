package org.example.HW_12_220224.task1;

import javax.xml.namespace.QName;
import java.util.Stack;

//
// 1 уровень сложности: 1) Вы работаете на складе, который продает один вид продукции, не имеющий сроков хранения, например кирпич.
//У вас всего одни двери на складе, через которые вы загружаете новый товар и отгружаете заказчикам тоже через эту же дверь.
//Как бы вы построили рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
//        Напишите программу, которая бы имитировала работу.

public  class Sklad_Stack {
    public  static void main(String[] args) {

        Stack<Kirpich> kirpiches = new Stack<>();

        // Завозим на склад

        kirpiches.push(new Kirpich(12));
        kirpiches.push(new Kirpich(13));
        kirpiches.push(new Kirpich(15));
        kirpiches.push(new Kirpich(18));


        System.out.println(kirpiches);

        // Продаем со склада

        System.out.println( "Продали ->" + kirpiches.pop());
        System.out.println( "Продали ->" + kirpiches.pop());

        // Завозим на склад

        kirpiches.push(new Kirpich(19));

        // Приехал ОБХСС - отчитались!

        System.out.println(kirpiches);


    }
    public static class Kirpich {
        int partNum;
        String name;

        public Kirpich(int partNum) {
            this.partNum = partNum;
            this.name = "Кирпичь обыкновенный";
        }

        @Override
        public String toString() {
            return " SuperTovar { " +
                     "Номер партии -> " + partNum +
                    "  " + name +
                    "} \n";
        }
    }
}
