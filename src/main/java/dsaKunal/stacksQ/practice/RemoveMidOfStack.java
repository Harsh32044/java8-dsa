package main.java.dsaKunal.stacksQ.practice;

import java.util.Stack;

public class RemoveMidOfStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println(stack);

        System.out.println(removeMid(stack));
    }

    public static Stack<Integer> removeMid(Stack<Integer> input) {

        int mid = input.size() / 2 + 1;
        int[] arr = new int[mid - 1];

        int i = 1;
        while(i != mid) {
            arr[i-1] = input.pop();
            i++;
            if(i == mid)
                input.pop();
        }

        for (int j = arr.length-1; j >= 0 ; j--) {
            input.push(arr[j]);

        }

        return input;
    }
}
