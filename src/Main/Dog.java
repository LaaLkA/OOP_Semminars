package Main;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable {
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness illustrious) {
        super(nickname, owner, birthDate, illustrious);
    }

    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void fly() {
        System.out.println("Собаки не умеют летать!");
    }

    @Override
    public void toGo() {
        System.out.println(nickname + "куда-то идёт");
    }

    @Override
    public void hunt() {
        System.out.println(nickname + "куда-то идёт");
    }
}
