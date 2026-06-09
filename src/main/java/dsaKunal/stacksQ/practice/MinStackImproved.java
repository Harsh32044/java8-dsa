package main.java.dsaKunal.stacksQ.practice;

public class MinStackImproved {

    private Node head;

    MinStackImproved() {

    }

    void push(int a) {
        if (head == null) {
            head = new Node(a, a, null);
        }
        else {
            head = new Node(a, Math.min(a, head.min), head);
        }
    }

    int pop() {
        if (head == null) {
            return -1;
        }
        int temp = head.val;
        head = head.next;
        return temp;
    }

    int peek() {
        return head.val;
    }

    int getMin() {
        if (head == null) {
            return -1;
        }
        return head.min;
    }

    class Node {
        int val;
        int min;
        Node next;

        Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        MinStackImproved minStackImproved = new MinStackImproved();

        minStackImproved.push(12);
        minStackImproved.push(-12);
        minStackImproved.push(-122);
        minStackImproved.push(91);
        minStackImproved.push(1);
        minStackImproved.push(0);
        minStackImproved.push(554);

        minStackImproved.pop();
        minStackImproved.pop();
        minStackImproved.pop();
        minStackImproved.pop();
        minStackImproved.pop();
        minStackImproved.pop();
        minStackImproved.pop();

        System.out.println(minStackImproved.getMin());
    }
}
