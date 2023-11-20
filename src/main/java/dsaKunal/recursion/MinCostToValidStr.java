package main.java.dsaKunal.recursion;

import java.util.Stack;

public class MinCostToValidStr {

    public static void main(String[] args) {
        String ss = "{{{}";

        System.out.println(findMinimumCost(ss));
    }

    public static int findMinimumCost(String str) {
        // Write your code here
        if (str.length() % 2 != 0) {
            return -1;
        }

        Stack<Character> stk = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{'){
                stk.push(ch);
            }

            else if (ch == '}' && !stk.empty() && stk.peek() == '{') {
                stk.pop();
            }
            else {
                stk.push(ch);
            }
        }

        int open = 0, close = 0;
        while(!stk.empty()) {
            if (stk.peek() == '{') {
                open++;
            }
            else {
                close++;
            }
            stk.pop();
        }

        return (open + 1) / 2 + (close + 1) / 2 ;


    }
}
