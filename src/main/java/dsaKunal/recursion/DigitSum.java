package main.java.dsaKunal.recursion;

public class DigitSum {
    public static void main(String[] args) {
//        System.out.println(sumOfDigits(93453));
//        System.out.println(reversedNumber(120));
//        System.out.println(countZeroes(30204));
        System.out.println(countSteps(34));
    }

    static int sumOfDigits(int n) {
        if (n < 10)
            return n;
        return n % 10 + sumOfDigits(n / 10);
    }

    static int prodOfDigits(int n) {
        if (n < 10)
            return n;
        return (n % 10) * prodOfDigits(n/10);
    }

    static int reversedNumber(int n) {
        if (n < 10)
            return n;
        int remDig = (int) Math.log10(n);
        return (int) ((n % 10) * Math.pow(10, remDig) + reversedNumber(n/10));
    }

    static int countZeroes(int n) {
        if (n < 10 && n != 0) {
            return 0;
        }
        if (n == 0)
            return 1;

        int count = n % 10 == 0 ? 1 : 0;
        return count + countZeroes(n/10);
    }

    static int countSteps(int n) {
        //if n is even, divide by 2, else subtract 1
        if (n == 0)
            return 0;
        if (n % 2 == 0)
            return 1 + countSteps(n/2);
        else
            return 1 + countSteps(n-1);
    }
}
