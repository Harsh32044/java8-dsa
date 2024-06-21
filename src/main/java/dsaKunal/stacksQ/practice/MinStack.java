package main.java.dsaKunal.stacksQ.practice;

import java.util.Arrays;

public class MinStack {

    private int mainPointer;
    private final int DEFAULT_SIZE = 10;
    private int[] mainArr;
    private int[] auxArr;
    private int auxPointer;
    private int minTillNow;

    public MinStack() {
        this.mainPointer = -1;
        this.auxPointer = -1;
        this.mainArr = new int[DEFAULT_SIZE];
        this.auxArr = new int[DEFAULT_SIZE];
        minTillNow = 0;
    }

    public void push(int val) {

        if (mainPointer == mainArr.length - 1) {
            int[] temp = new int[mainArr.length * 2];
            int[] temp2 = new int[auxArr.length * 2];
            System.arraycopy(mainArr, 0, temp, 0, mainArr.length);
            System.arraycopy(auxArr, 0, temp2, 0, auxArr.length);
            mainArr = temp;
            auxArr = temp2;
        }
        mainArr[++mainPointer] = val;

        if (auxPointer == -1) {
            auxArr[++auxPointer] = val;
        }
        else {
            auxArr[auxPointer + 1] = Math.min(val, auxArr[auxPointer]);
            auxPointer++;
        }


    }

    public int pop() {
        if (mainPointer == -1 || auxPointer == -1) {
            return -1;
        }
        auxPointer--;
        return mainArr[mainPointer--];
    }

    public int getMin() {
        return auxArr[auxPointer];
    }

    public int[] getAuxArr() {
        return auxArr;
    }
    public int[] getMainArr() {
        return mainArr;
    }

    @Override
    public String toString() {
        int[] temp = new int[mainPointer+1];
        System.arraycopy(mainArr, 0, temp, 0, mainPointer+1);
        return Arrays.toString(temp);
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();

        minStack.push(10);
        minStack.push(-10);
        minStack.push(67);
        minStack.push(100);
        minStack.push(-22);
        minStack.push(-23);

        System.out.println(minStack);
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.getMin());

    }
}
