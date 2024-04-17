package main.java.multithread;

public interface Random {

    int a = 5;

     default void run() {
        System.out.println("Default Run");
    }

}
