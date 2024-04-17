package main.java.multithread;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddCompFut {

    private static Object object = new Object();

    private static IntPredicate evenCond =  num -> num % 2 == 0;
    private static IntPredicate oddCond =  num -> num % 2 != 0;
    public static void main(String[] args) throws InterruptedException {

        CompletableFuture.runAsync(() -> EvenOddCompFut.printNumber(oddCond));
        CompletableFuture.runAsync(() -> EvenOddCompFut.printNumber(evenCond));

        Thread.sleep(1000);
    }

    public static void printNumber(IntPredicate condition) {
        IntStream.rangeClosed(1, 10).filter(condition).forEach(EvenOddCompFut::execute);
    }

    public static void execute(int numberToBePrinted) {
        synchronized (object) {
            try {
                System.out.println("Current Thread: "+Thread.currentThread().getName() + ", value: " + numberToBePrinted);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
