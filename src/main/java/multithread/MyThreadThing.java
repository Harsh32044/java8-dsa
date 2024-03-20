package main.java.multithread;

public class MyThreadThing implements Runnable{

    private final int threadNum;

    public MyThreadThing(int threadNum) {
        this.threadNum = threadNum;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from thread number " + threadNum);

            try {
                Thread.sleep(1000);
            }
            catch (Exception ignored) {
            }
        }
    }
}
