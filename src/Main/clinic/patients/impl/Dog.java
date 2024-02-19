package Main.clinic.patients.impl;


import Main.clinic.patients.Animal;
import Main.clinic.patients.Goable;
import Main.clinic.patients.Huntable;
import Main.clinic.patients.Swimable;

public class Dog extends Animal implements Goable, Huntable, Swimable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void go() {
        System.out.println("Dog: " + name + " is going");
    }

    @Override
    public void hunt() {
        System.out.println("Dog: " + name + " is hunting");
    }

    @Override
    public void swim() {
        System.out.println("Dog: " + name + " is swimming");

    }
}
