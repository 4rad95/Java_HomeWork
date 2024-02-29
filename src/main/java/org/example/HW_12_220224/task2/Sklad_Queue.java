package org.example.HW_12_220224.task2;

import org.example.HW_12_220224.task1.Sklad_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


//2)* Тот же склад, что и в случае п.1 но у Вас есть две двери - одна в начале склада, вторая в конце.
//
//Как бы вы построили оптимальный рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
//
//        Напишите программу, которая бы имитировала работу.

public class Sklad_Queue {
    public static void main(String[] args) {


    Queue<KirpichSuper> kirpiches1 = new LinkedList<>();

    // Завозим на склад

        kirpiches1.offer(new KirpichSuper(12));
        kirpiches1.add(new KirpichSuper(13));
        kirpiches1.offer(new KirpichSuper(15));
        kirpiches1.add(new KirpichSuper(18));


        System.out.println(kirpiches1);

    // Продаем со склада


        System.out.println( "Продали ->" + kirpiches1.poll());
        System.out.println( "Продали ->" + kirpiches1.poll());

    // Завозим на склад

        kirpiches1.add(new KirpichSuper(19));

    //    Опять приехал ОБХСС - отчитались.
    //    Наказали невиновных, наградили непричастных

        System.out.println(kirpiches1);


}
public static class KirpichSuper {
    int partNum;
    String name;

    public KirpichSuper(int partNum) {
        this.partNum = partNum;
        this.name = "Супер кирпичь";
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
