package main.java.dsaKunal.stacksQ.theory;

public class QueueMain {

    public static void main(String[] args) {

        CustomQueue customQueue = new CustomQueue();

        customQueue.add(10);
        customQueue.add(20);
        customQueue.add(30);
        customQueue.add(40);
        customQueue.add(50);
        customQueue.add(60);

        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
    }
}
