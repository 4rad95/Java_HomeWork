package org.example.HW_06_010224.task1;

// 1 уровень сложности: 1. Создайте обобщенный интерфейс для калькулятора, в котором будут объявлен перечень операций,
// которые умеет делать ваш калькулятор add, sub, multi и div и реализуйте классы, которые будут включать данный интерфейс
// для работы с различными типами данных аргументов.

public class task1 {
    public static void main(String[] args) {


        IntegerCalculator intCalculator = new IntegerCalculator();
        int sum = intCalculator.add(123, 2);
        System.out.println("Сумма: " + sum);

        DoubleCalculator doubleCalculator = new DoubleCalculator();
        double result = doubleCalculator.div(42.5, 12.3);
        System.out.println("Результат: " + result);
    }
}
