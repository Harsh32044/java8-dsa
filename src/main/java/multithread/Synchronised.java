package main.java.multithread;

class Count {
    int count;

    public synchronized void increment() {
        count++;
    }
}
public class Synchronised {
    public static void main(String[] args) throws InterruptedException{
        Count count = new Count();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                count.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                count.increment();
            }
        });
        t1.start();
        t2.start();

//        t1.setPriority(19);
        System.out.println(Thread.currentThread().getPriority());
        t1.join();
        System.out.println(Thread.currentThread().getName());
        t2.join();

        System.out.println("Count: "+count.count);
    }
}