package Main.seminar6.homework.util;


import Main.seminar6.homework.core.user.impl.User;

public class Persister {

    public void saveUser(User user) {
        System.out.println("Save user: " + user.getName());
    }
    public void reportForUser(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
