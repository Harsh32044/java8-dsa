package main.java.reflection;

public class Cat {
    private final String name;

    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow() {
        System.out.println("Meow!");
    }

    private void heyThisIsPrivate() {
        System.out.println("Private Method. Can't be accessed from outside this class");
    }

    public static void thisIsPublicStaticMethod() {
        System.out.println("I am public and static.");
    }

    private static void heyThisIsPrivateStatic() {
        System.out.println("Private Static Method. Can't be called from outside this class");
    }

}

