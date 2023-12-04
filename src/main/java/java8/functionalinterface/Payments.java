package main.java.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Payments {

    public void log10(int i) {
        System.out.println(Math.log10(i));
    }
    public static void main(String[] arg) {
        UPIPayments upiPayments = (src, des) -> String.valueOf(src.hashCode() + des.hashCode()) + "@NoImpl";

        PaytmUPI paytmUPI = new PaytmUPI();
        System.out.println(paytmUPI.doPayment("SRC", "DSTN") );

        int[] arr = {1,2,5,6,2,3,1};

        int[] newArr = Arrays.stream(arr)
                .distinct().sorted().filter(n -> n>4).toArray();

        System.out.println(Arrays.toString(newArr));

        List<Integer> list = Stream.of(1,2,3,4, 5, 6, 7)
                .toList();
        Payments payments = new Payments();
        list.stream().filter(i -> i < 4).forEach(payments::log10);


    }
}
