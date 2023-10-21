package com.example.app;

public class User {
    private int id;
    private String name;
    private String email;

    User(int id, String name, String email) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String toString() {
        return name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
