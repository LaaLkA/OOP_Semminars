package Main.seminar6.homework.core.user.impl;


import Main.seminar6.homework.core.user.Persisterable;
import Main.seminar6.homework.core.user.impl.User;

public class Persister implements Persisterable {

    @Override
    public void saveUser(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
