package main.java.dsaKunal.stacksQ.practice;

import java.util.Comparator;
import java.util.Stack;

public class SortStack {

    public void sortStack(Stack<Integer> stack) {
        // base case
        if (stack.empty())
            return;

        int temp = stack.pop();
        sortStack(stack);

        sortedInsert(stack, temp);
    }

    public void sortedInsert(Stack<Integer> stack, int temp) {

        Comparator<Integer> comp = (num1, num2) -> num1-num2;

        //base case
        if (stack.empty() || (!stack.empty() && stack.peek() < temp)) {
            stack.push(temp);
            return;
        }

        int n = stack.pop();
        sortedInsert(stack, temp);

        stack.push(n);
    }
}
