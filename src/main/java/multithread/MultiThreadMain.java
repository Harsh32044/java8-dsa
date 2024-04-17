package main.java.multithread;

public class MultiThreadMain {
    public static void main(String[] args) {

//        for (int i = 0; i < 5; i++) {
//            MyThreadThing myThreadThing = new MyThreadThing(i);
//            Thread myThread = new Thread(myThreadThing);
//            myThread.setPriority(10);
//            myThread.start();
//        }
        MyThreadThingg myThreadThing = new MyThreadThingg(1);
        Thread myThread = new Thread(myThreadThing);
        myThread.setPriority(Thread.MIN_PRIORITY);
        myThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from thread :" + Thread.currentThread().getName());
        }

    }
}
class MyThreadThingg implements Runnable{

    private final int threadNum;

    public MyThreadThingg(int threadNum) {
        this.threadNum = threadNum;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from thread number " + threadNum);
        }
    }
}
