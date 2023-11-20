package main.java.dsaKunal.stacksQ.theory;

import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(394);
        stack.push(-12);
        stack.push(10);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        /*Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(23);
        queue.add(111);
        queue.add(-1);
        queue.add(90);
        queue.add(2);

        System.out.println(queue);
        System.out.println(queue.poll());*/


        Deque<Integer> deque = new LinkedList<>(); // or ArrayDeque

    }
}
