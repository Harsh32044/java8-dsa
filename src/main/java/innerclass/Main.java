package main.java.innerclass;

public class Main {
    public static void main(String[] args) {

        OuterClass objOuterClass = new OuterClass();

        objOuterClass.heyThere();

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.wassup();
    }
}
