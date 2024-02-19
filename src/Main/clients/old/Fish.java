package Main.clients.old;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String nickname, Owner owner, LocalDate birthDate, Illness illustrious) {
        super(nickname, owner, birthDate, illustrious);
    }

    public Fish() {
        super("Fish", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"));
    }

    @Override
    public void eat() {
        System.out.println("Fish eating");
    }

    @Override
    public void fly() {
        System.out.println("Рыбы не умеют летать!");
    }
}
