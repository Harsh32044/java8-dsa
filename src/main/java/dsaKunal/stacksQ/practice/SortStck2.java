package main.java.dsaKunal.stacksQ.practice;

import java.util.Stack;

public class SortStck2 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(-12);
        stack.push(99);
        stack.push(-21);
        stack.push(42);
        stack.push(-55);

        sortStack(stack);

        System.out.println(stack);
    }

    static void sortStack(Stack<Integer> stack) {

        if (stack.empty()) {
            return;
        }

        int temp = stack.pop();
        sortStack(stack);
        sortedInsert(stack, temp);

    }

    private static void sortedInsert(Stack<Integer> stack, int temp) {

        if (stack.empty()) {
            stack.push(temp);
            return;
        }

        if (temp > stack.peek()) {
            stack.push(temp);
        }
        else {
            int temp2 = stack.pop();
            sortedInsert(stack, temp);
            stack.push(temp2);
        }
    }
}
