package main.java.dsaKunal.stacksQ.theory;

public class CircularQueue {

    protected int[] data;

    private static final int DEFAULT_SIZE=10;

    protected int front = 0;
    protected int end = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void insert(int item) {
        if (isFull()) {
            return;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
    }

    public int remove() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }

        int rem = data[front++];
        front = front % data.length;
        size--;
        return rem;
    }

    public int front() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty");

        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i = i % data.length;
        } while (i != end);
        System.out.println("END");
    }
}
