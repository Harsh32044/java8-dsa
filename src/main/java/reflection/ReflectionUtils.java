package main.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        Cat ct = new Cat("Jerry", 6);

        // java.lang.Field
        Field[] declaredFields = ct.getClass().getDeclaredFields();
        Method[] declaredMethods = ct.getClass().getDeclaredMethods();

        System.out.println("Getting Name of Cat: " + ct.getName());

        for (Field field: declaredFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(ct, "Stella");
            }
//            System.out.println(field.getName());
        }

        System.out.println("Getting Name of Cat: " + ct.getName());

        System.out.println("========================ALL METHODS===================");

        for (Method method : declaredMethods) {
            switch (method.getName()) {
                case "heyThisIsPrivate", "heyThisIsPrivateStatic" -> {
                    method.setAccessible(true);
                    method.invoke(ct);
                }
                case "thisIsPublicStaticMethod" -> method.invoke(null);
            }
//            System.out.println(method.getName());
        }
    }
}
