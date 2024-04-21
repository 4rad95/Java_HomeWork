package Algorithmen.HW_5_20240325;

import org.example.HW_23_110424.SpecialStack;

// 1 уровень сложности: 1) Задача getMin().
//Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком,
//такие как push(), pop(), isEmpty(), … и дополнительную операцию getMin(),
//которая должна возвращать минимальный элемент из SpecialStack.
//Все эти операции SpecialStack должны быть O(1). Пространство O(n)
//Чтобы реализовать SpecialStack, используйте структуру данных Stack, реализованную ранее в классе.

public class task1 {
    public static void main(String[] args) {

        SpecialStack ourStack = new SpecialStack() ;

        ourStack.push(2);
        ourStack.push(3);
        ourStack.push(4);
        ourStack.push(5);
        ourStack.push(1);
        ourStack.push(6);
        ourStack.push(7);

        System.out.println(ourStack.getMin());
        System.out.println();

        while (true)  {
            if  (ourStack.isEmpty()) { break;}
            System.out.print(ourStack.pop() + " ");
        }
        System.out.println();

    }
}
