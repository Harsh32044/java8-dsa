package main.java.arraysandstrings.easy;

public class EvenOddMT implements Runnable{

    Object obj;

    private int count = 1;

    public EvenOddMT(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        while (count <= 100) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (obj) {
                    System.out.println("Thread Name: " + Thread.currentThread().getName() + " value: " + count);
                    count++;
                    try {
                        obj.wait();
                    }
                    catch (InterruptedException ignored) {

                    }
                }
            }

            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (obj) {
                    System.out.println("Thread Name: " + Thread.currentThread().getName() + " value: " + count);
                    count++;
                    obj.notify();
                }
            }

        }
    }

    public static void main(String[] args) {

    }

}
