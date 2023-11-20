package main.java.dsaKunal.stacksQ.theory;

import java.util.NoSuchElementException;

public class CustomQueue {

    protected int[] data;

    private static final int DEFAULT_SIZE=10;

    protected int ptr = -1;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public void add(int item) {
        if(isFull()) {
            throw new IllegalStateException("Queue size exceeded. Unable to add any new elements.");
        }
        data[++ptr] = item;
    }

    public int remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        int temp = data[0];
        for (int i = 0; i <= ptr; i++) {
            data[i] = data[i+1];
        }
        ptr--;
        return temp;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }
}
