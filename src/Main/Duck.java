package Main;

import java.time.LocalDate;

public class Duck extends Animal{
    public Duck(String nickname, Owner owner, LocalDate birthDate, Illness illustrious) {
        super(nickname, owner, birthDate, illustrious);
    }

    public Duck() {
        super("Duck", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"));
    }

    @Override
    public void eat() {
        System.out.println("Duck eating");
    }

}
