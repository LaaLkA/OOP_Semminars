package Main.seminar6.homework.core.user.impl;


public class User {
    private String name;
    public Persister persister;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
