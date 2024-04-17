package main.java.multithread;

public class SynchronizedWithTwoThreads {

    public static void main(String[] args) {

        Display d = new Display();

        MyThread1 th1 = new MyThread1(d);
        MyThread2 th2 = new MyThread2(d);

        th1.start();
        th2.start();
    }
}

class Display {

    public synchronized void displayChar() {
        for (int i = 65; i <= 75; i++) {
            System.out.print((char) i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ignored) {}
        }
    }

    public synchronized void displayNums() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ignored) {}
        }
    }
}

class MyThread1 extends Thread {

    Display d;
    public MyThread1(Display display) {
        this.d = display;
    }

    @Override
    public void run() {
        d.displayChar();
    }
}

class MyThread2 extends Thread {

    Display d;
    public MyThread2(Display display) {
        this.d = display;
    }

    @Override
    public void run() {
        d.displayNums();
    }
}
