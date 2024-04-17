package main.java.dsaKunal.stacksQ.practice;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        reverseStack(stack);

        System.out.println(stack);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.empty())
            return;
        int temp = stack.pop();
        reverseStack(stack);
        helperToPushAtBottom(stack, temp);
    }


    public static void helperToPushAtBottom(Stack<Integer> stack, int item) {
        //base case, stack gets emptied, push the input element
        if(stack.empty()) {
            stack.push(item);
            return;
        }

        int temp = stack.pop();
        helperToPushAtBottom(stack, item);
        stack.push(temp);
    }

    public static class ReverseString {
        public static void main(String[] args) {
            String name = "Harsh";

            System.out.println(reverse(name));
        }

        public static String reverse(String s) {
            if (s.length() <= 1)
                return s;
            Stack<Character> characterStack1 = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                characterStack1.push(s.charAt(i));
            }

            StringBuilder res = new StringBuilder();
            while(!characterStack1.empty()) {
                res.append(characterStack1.pop());
            }

            return res.toString();
        }
    }
}
