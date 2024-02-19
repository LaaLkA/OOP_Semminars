package Main.clinic.patients.impl;


import Main.clinic.patients.Animal;
import Main.clinic.patients.Flyable;
import Main.clinic.patients.Goable;

public class Parrot extends Animal implements Goable, Flyable {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Parrot " + name + " is flying. Speed - " + getFlySpeed());
    }

    @Override
    public void go() {
        System.out.println("Parrot " + name + " is going. Speed - " + getRunSpeed());
    }

    @Override
    public double getRunSpeed() {
        return 0.2D;
    }
}
