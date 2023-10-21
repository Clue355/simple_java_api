package com.example.app;
import com.example.app.exceptions.UserNotFoundException;

import java.util.*;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<Integer, User> users = new HashMap<Integer, User>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(int id) throws UserNotFoundException {
        if (users.get(id) == null) {
            throw new UserNotFoundException("User with ID " + id + " not found.");
        }
        return users.get(id);
    }

    public String getUserEmail(int id) throws UserNotFoundException {
        if (users.get(id) == null) {
            throw new UserNotFoundException("User with ID " + id + " not found.");
        }
        return users.get(id).getEmail();
    }



    public ArrayList<String> getUsers() {
        ArrayList<String> names = new ArrayList<String>();
        users.forEach((key,value) -> {
            names.add(value.toString());
        });
        return names;
    }

}