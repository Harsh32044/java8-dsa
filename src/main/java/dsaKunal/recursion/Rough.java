package main.java.dsaKunal.recursion;

public class Rough {
    public static void main(String[] args) {
        oneToN(5);
    }

    static void oneToN(int n) {

        if (n == 0)
            return;
        System.out.println(n);
        oneToN(n-1);
        System.out.println(n);
    }
}
