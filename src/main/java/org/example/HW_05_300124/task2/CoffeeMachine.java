package org.example.HW_05_300124.task2;

public class CoffeeMachine {

    private static CoffeeMachine instance;
    public enum CoffeeType {
        AMERICANO,
        ESPRESSO,
        LATTE,
        CAPPUCCINO
    }

    private CoffeeMachine() {
        // Инициализация автомата (например, загрузка кофе, воды, etc.)
    }

    public static synchronized CoffeeMachine getInstance() {
        if (instance == null) {
            instance = new CoffeeMachine();
        }
        return instance;
    }

    public void makeCoffee(CoffeeType type) {
        // Приготовление кофе выбранного типа
        switch (type) {
            case AMERICANO:
                Americano();
                return;
            case ESPRESSO:
                Espresso();
                return;
            case LATTE:
                Latte();
                return;
            case CAPPUCCINO:
                Cappuccino();
                return;
            default:
                throw new IllegalArgumentException("Неизвестный тип кофе: " + type);
        }

    }
    public void Americano(){
        System.out.println("Делаем амерекано");
    }
    public void Espresso(){
        System.out.println("Делаем еспресо");
    }
    public void Latte(){
        System.out.println("Делаем Латте");
    }
    public void Cappuccino(){
        System.out.println("Делаем Капучино");
    }
}