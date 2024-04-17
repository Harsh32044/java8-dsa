package main.java.streams.mapflatmap;

import java.util.List;

public class Customer {

    private int id;
    private String name;
    private String email;

    private List<String> phones;

    public Customer(int id, String name, String email, List<String> phones) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phones = phones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhones() {
        return phones;
    }
}
