package main.java.streams;

import java.util.List;

public class User {

    private String name;
    private String phone;
    private List<String> mailIds;

    public User(String name, String phone, List<String> mailIds) {
        this.name = name;
        this.phone = phone;
        this.mailIds = mailIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getMailIds() {
        return mailIds;
    }

    public void setMailIds(List<String> mailIds) {
        this.mailIds = mailIds;
    }
}
