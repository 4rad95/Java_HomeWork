package org.example.HW_05_300124.task2;

//2*) У вас на работе есть один кофейный автомат. Он умеет готовить развличные виды кофе. Но он только один.
//Реализуйте класс кофейного автомата, с помощью которого любой человек может приготовить себе различные варианты кофе.
//Но что важно, сколько ко бы раз не обращался человек за изготовлением кофе, или какие бы люди не пытались
public class task2 {

        public static void main(String[] args) {

            CoffeeMachine machine = CoffeeMachine.getInstance();

            machine.makeCoffee(CoffeeMachine.CoffeeType.AMERICANO);
            System.out.println("Приготовлен американо!");

            machine.makeCoffee(CoffeeMachine.CoffeeType.LATTE);
            System.out.println("Приготовлен латте!");
        }
 }


