package main.java.arraysandstrings.easy;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        MyThread.mt = Thread.currentThread();
        MyThread th = new MyThread();

        Thread.sleep(10000);


        th.start();
        th.interrupt();

        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" Thread");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException ignored) {

            }
        }
    }

    public int add(int n1, int n2) {
        return 2;
    }

    public double add(double d1, double d2) {
        return d1 * d2;
    }
}

class MyThread extends Thread {

    static Thread mt;
    @Override
    public void run() {
        try {
            mt.join();
        }
        catch (InterruptedException ignored) {

        }

        for(int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}
