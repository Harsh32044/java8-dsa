package main.java.dsaKunal.stacksQ.practice;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    public void push(int item) {
        stack1.push(item);
    }

    public int pop() {
        peek();
        return stack2.pop();
    }

    public int peek() {
        if (stack2.empty()) {
            while(!stack1.empty())
                stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.empty();
    }
}
