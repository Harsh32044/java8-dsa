package main.java.dsaKunal.stacksQ.theory;

public class CircularQueueMain {

    public static void main(String[] args) throws Exception {

        CircularQueue circularQueue = new CircularQueue(5);

        circularQueue.insert(12);
        circularQueue.insert(24);
        circularQueue.insert(36);
        circularQueue.insert(48);
        circularQueue.insert(60);

        circularQueue.display();

        circularQueue.remove();

        circularQueue.display();
        circularQueue.insert(99);

        circularQueue.display();
    }
}
