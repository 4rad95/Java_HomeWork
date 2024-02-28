package org.example.HW_10_150224.task1;

import java.lang.reflect.Array;
import java.util.*;
// 1 уровень сложности: 1) Вы пришли в отделение банка, в котором обслуживание ведется строго по талончикам, который Вы получаете в автомате при входе.
//        При регистрации, Вы обязательно указываете ФИО, год рождения, тип операции который Вам необходимо выполнить в отделении (например
//                                                                                                                                         Консультация, Получение денежных средств, Вложение средств, Открытие депозита, Коммунальные платежи).
//После регистрации - вы получаете номер талончика.
//Обслуживание в банке ведется строго по номеру талончика в порядке их возрастания.
//        Создать множество, которое будет обслуживать класс Ticket.
//Подумайте какой тип Set - а вы могли бы использовать для этой задачи.
//Сымитируйте работу отделения банка.
public  class BankOperation {

    // Искрене надеюсь что название класса Talon, а не Tickets не будет грубой ошибкой. ))

    public static void main(String[] args) {
        // Регистрация клиентов
        Set<Talon> talons = new HashSet<Talon>() ;

        talons.add(new Talon(3,"Иванов Иван Иванович", 1980, Operation.CONSULTATION));
        talons.add(new Talon(5,"Иванов Иван Иванович", 1980, Operation.CONSULTATION));
        talons.add(new Talon(2,"Петрова Мария Сергеевна", 1990, Operation.OPENING_DEPOSIT));
        talons.add(new Talon(1,"Сидоров Николай Петрович", 1970, Operation.INVESTMENT));
        talons.add(new Talon(2,"Марьянова Мария Сергеевна", 1990, Operation.OPENING_DEPOSIT));  // неправильный талон

        // Обслуживание клиентов
        while (!talons.isEmpty()) {
            Talon currentTalon = talons.iterator().next();
            System.out.println("Обслуживается клиент: " + currentTalon);
            talons.remove(currentTalon);
        }

        System.out.println("Все клиенты обслужены");
    }
}
