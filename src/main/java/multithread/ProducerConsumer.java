package main.java.multithread;

public class ProducerConsumer {

    public static void main(String[] args) {
        SimpleBlockingQueue sb = new SimpleBlockingQueue();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    sb.produce(i);
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted while producing");
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    int val = sb.consume();
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted while consuming");
            }
        });

        producer.start();
        consumer.start();
    }
}

class SimpleBlockingQueue {
    private int value;
    private boolean hasValue;

    public synchronized void produce(int newValue) throws InterruptedException {
        while (hasValue) {
            wait();
        }

        hasValue = true;
        value = newValue;
        System.out.println("Produced: " + newValue);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (!hasValue) {
            wait();
        }

        System.out.println("Consumed: " + value);
        hasValue = false;
        notifyAll();
        return value;
    }
}
