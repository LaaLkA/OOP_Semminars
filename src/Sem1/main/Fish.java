package Sem1.main;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String nickname, Owner owner, LocalDate birthDate, Illness illustrious) {
        super(nickname, owner, birthDate, illustrious);
    }

    public Fish() {
        super("Fish", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"));
    }

    @Override
    public void toGo() {
        System.out.println("Рыбы не умеют ходить!");
    }

    @Override
    public void fly() {
        System.out.println("Рыбы не умеют летать!");
    }
}
