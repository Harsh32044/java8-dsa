package main.java.dsaKunal.stacksQ.practice;

public class QueueWithStacks {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        myQueue.push(12);
        myQueue.push(23);
        myQueue.push(35);
        myQueue.push(47);
        myQueue.push(59);

        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());

        System.out.println(myQueue.empty());
    }
}
