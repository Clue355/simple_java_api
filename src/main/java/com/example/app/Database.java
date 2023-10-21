package com.example.app;
import com.example.app.exceptions.UserNotFoundException;

import java.util.*;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<Integer, User> users = new HashMap<Integer, User>();

    public void addUser(User user) throws UserNotFoundException {
        if (user == null) {
            throw new UserNotFoundException("User with is missing an ID");
        }
        users.put(user.getId(), user);
    }

    public User getUser(int id) throws UserNotFoundException {
        if (users.get(id) == null) {
            throw new UserNotFoundException("User with ID " + id + " not found.");
        }
        return users.get(id);
    }



    public Collection<User> getUsers() {
        return users.values();
    }

}