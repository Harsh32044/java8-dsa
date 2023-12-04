package main.java.innerclass;

public class OuterClass {

    int num = 6;

    public void heyThere() {
        System.out.println("Hey There!");

        class LocalInnerClass{

            final String localInnerClassVar = "Here's Johnny!";
            public void printLocalInnerClassVar() {
                System.out.println(localInnerClassVar + " From Local Inner Class");
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.printLocalInnerClassVar();
    }

    public static class InnerClass {
        int innerNum = 8;

        public void wassup() {
            System.out.println("Hello from Inner Class");
        }
    }
}
