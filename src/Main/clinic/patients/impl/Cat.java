package Main.clinic.patients.impl;


import Main.clinic.patients.Animal;
import Main.clinic.patients.Goable;
import Main.clinic.patients.Huntable;
import Main.clinic.patients.Swimable;

public class Cat extends Animal implements Huntable, Goable, Swimable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void go() {
        System.out.println("Cat: " + name + " is going. Speed - " + getRunSpeed());
    }

    @Override
    public void hunt() {
        System.out.println("Cat: " + name + " is hunting");
    }

    @Override
    public void swim() {
        System.out.println("Cat: " + name + " is swimming. Speed - " + getSwimSpeed());
    }
}
