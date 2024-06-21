package main.java.annotations;

@interface MyAnno {

    String name();
    String version();
    String project();
}
@MyAnno(name="HarshClass", version = "1.8", project = "TCS BaNCS ")
public class CustomAnno {

    int instance;
    public static void main(String[] args) {

        int x = 10;
    }
}
