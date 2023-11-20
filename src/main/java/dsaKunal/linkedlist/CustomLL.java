package main.java.dsaKunal.linkedlist;

public class CustomLL {

    private int size;
    private Node head;
    private Node tail;

    public CustomLL() {
        this.size = 0;
    }

    //Insert at beginning

    public void insertAtBeginning(int newValue) {
        Node temp = new Node(newValue);
        temp.next = head;
        head = temp;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertAtEnd(int endVal) {
        Node endNode = new Node(endVal);
        tail.next = endNode;
        tail = endNode;

        size++;
    }

    public void insertAtNthIndex(int val, int N) {
        Node tempNode = new Node(val);
        Node iterator = head;
        for (int i = 0; i < N-1; i++) {
            iterator = iterator.next;
        }
        //
        tempNode.next = iterator.next;
        iterator.next = tempNode;
        size++;
    }

    public void printLL() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public int getSize() {
        return this.size;
    }

    public void insertAtMid(int midVal) {
        int tempSize = getSize() % 2 == 0 ? (getSize() / 2) - 1 : (getSize() / 2);
        Node newNode = new Node(midVal);
        Node temp = head;

        while(tempSize != 0) {
            temp = temp.next;
            tempSize--;
        }
        Node temp2 = temp.next;
        temp.next = newNode;
        newNode.next = temp2;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }


    }
}
