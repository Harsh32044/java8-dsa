package main.java.roughwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastList {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        integers.add(2);
        integers.add(7);
        integers.add(3);

        Iterator<Integer> itr = integers.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            integers.add(3);
        }
    }
}
