package org.example.HW_05_300124.task2;

public class task2 {

        public static void main(String[] args) {

            CoffeeMachine machine = CoffeeMachine.getInstance();

            machine.makeCoffee(CoffeeMachine.CoffeeType.AMERICANO);
            System.out.println("Приготовлен американо!");

            machine.makeCoffee(CoffeeMachine.CoffeeType.LATTE);
            System.out.println("Приготовлен латте!");


        }
 }


