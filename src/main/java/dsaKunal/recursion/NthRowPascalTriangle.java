package main.java.dsaKunal.recursion;

import java.math.BigInteger;
import java.util.ArrayList;
public class NthRowPascalTriangle {
    public static void main(String[] args) {
        System.out.println(nthRowOfPascalTriangle(74));
    }

    static ArrayList<BigInteger> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<BigInteger> prev = new ArrayList<>();
        prev.add(0,BigInteger.ONE);
        for(int i = 0; i < n; i++) {
            ArrayList<BigInteger> curr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    curr.add(j, BigInteger.ONE);
                }
                else {
                    BigInteger sumPrev = prev.get(j-1).add(prev.get(j));
                    curr.add(j,sumPrev);
                }
            }
            prev = curr;
        }
        return prev;
    }
}
