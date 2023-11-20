package main.java.dsaKunal.stacksQ.practice;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

        String s = "";

        System.out.println(isValidParenthesis(s));
    }
    public static boolean isValidParenthesis(String s) {

        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                brackets.push(s.charAt(i));
            } else if ((!brackets.empty()) && ((s.charAt(i) == ']' && brackets.peek() == '[') ||
                    (s.charAt(i) == ')' && brackets.peek() == '(')
            || (s.charAt(i) == '}' && brackets.peek() == '{'))) {
                brackets.pop();
            }
            else
                return false;
        }
        return brackets.empty();
    }
}
