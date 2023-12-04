package main.java.roughwork;

public class Student implements Comparable<Student>{

    private String name;
    private int roll;

    public Student(String naam, int anukramank) {
        this.name = naam;
        this.roll = anukramank;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public int compareTo(Student that) {
        return this.roll % 10 - that.roll % 10;
    }

    @Override
    public String toString() {
        return "Student {name = " +
                name + ", roll = " + roll + "}";
    }
}
