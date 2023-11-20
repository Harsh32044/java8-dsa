package main.java.dsaKunal.linkedlist;

import java.util.*;

public class CustomLLMain {
    public static void main(String[] args) {
        CustomLL linkedList = new CustomLL();

        linkedList.insertAtBeginning(12);
        linkedList.insertAtBeginning(13);
        linkedList.insertAtBeginning(14);

        linkedList.insertAtEnd(11);
        linkedList.insertAtMid(13);
        linkedList.insertAtNthIndex(100, 4);

//        linkedList.printLL();
        TreeSet<StringBuffer> ts = new TreeSet<>();

        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("B"));
        ts.add(new StringBuffer("C"));
        ts.add(new StringBuffer("D"));
        ts.add(new StringBuffer("E"));

        System.out.println(ts);
    }
}
