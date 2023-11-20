package main.java.dsaKunal.stacksQ.theory;

import java.util.Arrays;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int ptr = -1;

    public CustomStack(int size) {
        this.data = new int[size];
    }
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item) throws CustomStackException {
        if (isFull()) {
            throw new CustomStackException("Stack size exceeded. Unable to add new elements");
        }
        this.data[++ptr] = item;
        return true;
    }
    public int pop() throws CustomStackException {
        if (isEmpty())
            throw new CustomStackException("Stack is empty, no more removal allowed.");
        return data[ptr--];
    }

    public int peek() throws CustomStackException{
        if(isEmpty()) {
            throw new CustomStackException("Stack is empty, no more removal allowed.");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
