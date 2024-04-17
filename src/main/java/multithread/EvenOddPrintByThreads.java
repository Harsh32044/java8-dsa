package main.java.multithread;

public class EvenOddPrintByThreads implements Runnable{

    Object object;

    public EvenOddPrintByThreads(Object object) {
        this.object = object;
    }

    static int count = 1;
    @Override
    public void run() {
        while (count <= 10) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println("Thread name: " + Thread.currentThread().getName()+" value: "+count);
                    count++;
                    try {
                        object.wait();
                    }
                    catch (InterruptedException ie) {
                        System.out.println(ie.getMessage());
                    }
                }
            }
            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println("Thread name: " + Thread.currentThread().getName()+" value: "+count);
                    count++;
                    object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {

        Object lock = new Object();

        Runnable rEven = new EvenOddPrintByThreads(lock);
        Runnable rOdd = new EvenOddPrintByThreads(lock);

        Thread odd = new Thread(rOdd, "odd");
        Thread even = new Thread(rEven, "even");

        odd.start();
        even.start();
    }
}
