package DesignPattern;

import java.util.ArrayList;

public class UserManagement {

    ArrayList<User> users = new ArrayList<User>();

    public void addUser(User user) {
        users.add(user);
    }
    public User getUser(int id) {return users.get(id);}
}
