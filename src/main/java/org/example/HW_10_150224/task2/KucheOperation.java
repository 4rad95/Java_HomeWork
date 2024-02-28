package org.example.HW_10_150224.task2;

//2)* В ресторане официанты подают заказы Order на кухню. Очень важно чтобы заказы брались в работу поварами строго в том порядке,
//в котором они были переданы на кухню. Создайте множество (Set) заказов, которые будут передаваться на кухню официантом и реализуйте
//механизм взятия в работу этих заказом поваром.
//Используйте LinkedHashSet для решения этой задачи.
//Характеристики Order определите самостоятельно.

import java.util.LinkedHashSet;
import java.util.Set;

public class KucheOperation {
    public static void main(String[] args) {

        Set<Order> orders = new LinkedHashSet<>();

        orders.add(new Order(1,"Салат Оливье, компот"));
        orders.add(new Order(2,"Салат Цезар, чай"));
        orders.add(new Order(3,"Салат Винигрет, кофе"));
        orders.add(new Order(4,"Жареный картофель, компот"));
        orders.add(new Order(5,"Омары с кетчуом, компот"));

        for (Order order : orders) {

            System.out.println("Следующий заказ : " + order.toString());
            order.setStatus(true);
            System.out.println(" Выполнен " + order.toString());
        }

    }
}
