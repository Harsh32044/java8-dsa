package main.java.multithread;

public class SynchronizedDemo {
    public static void main(String[] args) {

        Display d1 = null;
        Display d2 = null;
        MyThreadd th1 = new MyThreadd(d1, "Dhoni");
        MyThreadd th2 = new MyThreadd(d2, "Kohli");
//        MyThreadd th3 = new MyThreadd(d, "Sehwag");

        th1.start();
        th2.start();
//        th3.start();
    }

    static class Display {
        public static synchronized void wish(String name) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Good Morning: ");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
                System.out.println(name + " " + i);
            }
        }
    }

    static class MyThreadd extends Thread {
        Display d;
        String name;

        public MyThreadd(Display d, String name) {
            this.d = d;
            this.name = name;
        }

        @Override
        public void run() {
            d.wish(name);
        }
    }
}


