package main.java.dsaKunal.stacksQ.practice;

import java.util.Stack;

public class RedundantBrackets {
    public static void main(String[] args) {

        String s = "(a+c*b)+c";

        System.out.println(findRedundantBrackets(s));
    }

    public static boolean findRedundantBrackets(String s) {
        Stack<Character> characters = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                characters.push(ch);
            }
            else {
                if (ch == ')') {
                    boolean isRedundant = true;
                    while (characters.peek() != '(') {
                        char top = characters.peek();
                        if (top == '+' || top == '-' || top == '*' || top == '/') {
                            isRedundant = false;
                        }
                        characters.pop();
                    }
                    if (isRedundant)
                        return true;
                    characters.pop(); // to remove the opening bracket '('
                }
            }
        }
        return false;
    }
}
