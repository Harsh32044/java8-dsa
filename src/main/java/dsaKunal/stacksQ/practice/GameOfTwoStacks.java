package main.java.dsaKunal.stacksQ.practice;

import java.util.*;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        int[] a1 =  {7, 15, 12, 0, 5, 18, 17, 2, 10, 15, 4, 2, 9, 15, 13, 12, 16, 12, 16, 6, 8, 16, 15, 18, 3, 11, 0, 17, 7, 6, 11, 14, 13, 15, 6, 18, 6, 16, 12, 16, 11, 16, 11};
        int[] b1 =  {12, 16, 6, 8, 16, 15, 18, 3, 11, 0, 17, 7, 6, 11, 14, 13, 15, 6, 18, 6, 16, 12, 16, 11, 16, 11};

        List<Integer> a = Arrays.stream(a1).boxed().toList();
        List<Integer> b = Arrays.stream(b1).boxed().toList();

        System.out.println(twoStacksRecursive(62,a,b));
    }

    public static int twoStacksRecursive(int maxSum, List<Integer> a, List<Integer> b) {
        int sizeA = a.size();
        int sizeB = b.size();
        int countA = 0;
        int countB = 0;
        int count = 0;
        int sum = 0;

        for (Integer integer : a) {
            sum += integer;

            if (sum > maxSum) {

                sum -= integer;
                break;
            }

            countA++;
        }

        count = countA;

        for(int j = 0; j < sizeB; j++) {

            sum += b.get(j);
            countB++;

            while(sum > maxSum && countA > 0){
                sum -= a.get(countA - 1);
                countA--;
            }

            count = (sum <= maxSum) ? Math.max((countA + countB), count) : count;
        }

        return count;
    }



    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        Stack<Integer> aa = new Stack<>();
        Stack<Integer> bb = new Stack<>();
        for(int i = a.size()-1;i >= 0; i--){
            aa.push(a.get(i));
        }

        for(int i = b.size()-1;i >= 0; i--){
            bb.push(b.get(i));
        }

        int score = 0, runSum = 0;
        if(!aa.empty() && !bb.empty()) {
            while(!aa.empty() && !bb.empty()) {
                int a1 = aa.peek();
                int b1 = bb.peek();

                int min;
                if (a1 > b1) {
                        bb.pop();
                        min = b1;
                    }
                else {
                        aa.pop();
                        min = a1;
                    }
                runSum += min;
                if (runSum > maxSum) {
                    break;
                }
                else {
                    score++;
                }
            }
        }

        if (!aa.empty()) {
            while(!aa.empty()) {
                runSum += aa.pop();
                if (runSum > maxSum)
                    break;
                else
                    score++;
            }
        }

        if (!bb.empty()) {
            while(!bb.empty()){
                runSum += bb.pop();
                if(runSum > maxSum)
                    break;
                else
                    score++;
            }
        }

        return score;
    }
}
