package Algorithmen.HW_5_20240325;


import java.util.Stack;

class SpecialStack {
    private Stack<Integer> spesialStack; // Main stack to store elements
    private Stack<Integer> minStack;    // Second stack, to store min element

    public SpecialStack() {
        spesialStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (spesialStack.isEmpty()) {
            spesialStack.push(x);
            minStack.push(x);
        } else {
            if (x < minStack.peek()) {
                spesialStack.push(x);
                minStack.push(x);
            } else {
                spesialStack.push(x);
            }
        }
    }

    public int pop() {
        if (spesialStack.isEmpty()) {
            System.out.println("Stack empty.");
        }

        int top = spesialStack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }

        return top;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack empty.");
        }

        return minStack.peek();
    }

    public boolean isEmpty() {
        return spesialStack.isEmpty();
    }
}