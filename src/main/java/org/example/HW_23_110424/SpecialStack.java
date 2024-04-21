package org.example.HW_23_110424;

//1 уровень сложности: 1) Задача getMin().
//        Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком,
//        такие как push(), pop(), isEmpty(), … и дополнительную операцию getMin(),
//        которая должна возвращать минимальный элемент из SpecialStack.
//        Все эти операции SpecialStack должны быть O(1). Пространство O(n)
//        Чтобы реализовать SpecialStack, используйте структуру данных Stack, реализованную ранее в классе.


import java.util.EmptyStackException;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SpecialStack {

        private Stack<Integer> st; // Main stack to store elements
        private Stack<Integer> aux; // Auxiliary stack to store minimum elements

        public SpecialStack() {
            st = new Stack<>();
            aux = new Stack<>();
        }

        public void push(int x) {
            if (st.isEmpty()) {
                st.push(x);
                aux.push(x);
            } else {
                if (x < aux.peek()) {
                    st.push(x);
                    aux.push(x);
                } else {
                    st.push(x);
                }
            }
        }

        public int pop() {
            if (st.isEmpty()) {
                System.out.println("Stack empty.");
            }

            int top = st.pop();
            if (top == aux.peek()) {
                aux.pop();
            }

            return top;
        }

        public int getMin() {
            if (aux.isEmpty()) {
                throw new EmptyStackException();
            }

            return aux.peek();
        }

        public boolean isEmpty() {
            return st.isEmpty();
        }
    }