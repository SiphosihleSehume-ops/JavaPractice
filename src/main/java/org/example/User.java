package org.example;

public class User {
    private String name;
    private int age;

    public User() {}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        this.name  = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

}
