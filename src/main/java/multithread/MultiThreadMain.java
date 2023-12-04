package main.java.multithread;

public class MultiThreadMain {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            MyThreadThing myThreadThing = new MyThreadThing(i);
            Thread myThread = new Thread(myThreadThing);
            myThread.start();
        }
    }
}
