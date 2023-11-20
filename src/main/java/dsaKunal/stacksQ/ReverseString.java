package main.java.dsaKunal.stacksQ;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String name = "";

        System.out.println(reverse(name));
    }

    public static String reverse(String s) {
        if (s.length() == 1)
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
