package main.java.dsaKunal.stacksQ.practice;

import java.util.Stack;

public class PushAtBottomOfStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);



        System.out.println(pushAtBottom(stack, 10));
    }

    public static Stack<Integer> pushAtBottom(Stack<Integer> stack, int item) {
        helper(stack, item);
        return stack;
    }

    public static void helper(Stack<Integer> stack, int item) {
        //base case, stack gets emptied, push the input element
        if(stack.empty()) {
            stack.push(item);
            return;
        }

        int temp = stack.pop();
        helper(stack, item);
        stack.push(temp);
    }
}
