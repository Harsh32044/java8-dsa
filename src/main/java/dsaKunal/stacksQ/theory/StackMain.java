package main.java.dsaKunal.stacksQ.theory;

public class StackMain {
    public static void main(String[] args) throws CustomStackException {

        DynamicStack customStack = new DynamicStack();

        customStack.push(12);
        customStack.push(2);
        customStack.push(11);
        customStack.push(-1);
        customStack.push(20);
        customStack.push(-22);
        customStack.push(90);

        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
    }
}
