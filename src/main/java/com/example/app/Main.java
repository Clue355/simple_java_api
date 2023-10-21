package com.example.app;

import com.example.app.exceptions.UserNotFoundException;

public class Main {
    private static Database database = new Database();

    public static void main(String[] args) throws UserNotFoundException {
        // add a user
        User user = new User(1, "John Doe", "john.doe@example.com");
        User user1 = new User(2, "Jane Doe", "jane.doe@example.com");
        database.addUser(user);
        database.addUser(user1);

        // retrieve a user
        User retrievedUser = database.getUser(2);
        System.out.println(retrievedUser.getName());
        System.out.println(database.getUsers());
        System.out.println(retrievedUser.getEmail());
    }
}