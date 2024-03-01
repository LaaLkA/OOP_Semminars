package Main.seminar6.homework.core.user.impl;


import Main.seminar6.homework.core.user.Reportable;
import Main.seminar6.homework.util.Persister;

public class User implements Reportable {
    private String name;
    public Persister persister;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void save() {
        persister.saveUser(this);
    }

    @Override
    public void report() {
        persister.reportForUser(this);
    }
}
