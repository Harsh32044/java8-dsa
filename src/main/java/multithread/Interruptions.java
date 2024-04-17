package main.java.multithread;

public class Interruptions {

    public static void main(String[] args) throws InterruptedException {

        MyThread th = new MyThread();
        th.start();
        //Main thread interrupting th child thread
        th.interrupt();
        System.out.println("End of Program");
    }
}

class MyThread extends Thread {

    @Override
    public void run() {

        try {
            for(int i = 0; i < 10; i++) {
                System.out.println("I am Lazy Thread");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }
    }

    Object obj = new Object();
}
