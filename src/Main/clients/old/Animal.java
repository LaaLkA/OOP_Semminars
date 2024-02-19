package Main.clients.old;

import java.time.LocalDate;

public abstract class Animal {
    protected String nickname;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    public Animal(String nickname, Owner owner, LocalDate birthDate, Illness illustrious) {
        this.nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illustrious;
    }

    public Animal(){
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"));
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public String getNickname() {
        return nickname;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getIllness() {
        return String.format("болезнь: %s", illness);
    }

    private void wakeUp(String time) {
        System.out.println("Животное проснулось" + nickname + " проснулось в " + time);
    }

    private void wakeUp() {
        wakeUp("12:00");
    }

    public abstract void eat();

    private void sleep() {
        System.out.println("Животное уснуло");
    }

//    public void liveCycle() {
//        wakeUp("12:00");
//        hunt();
//        eat();
//        sleep();
//    }

    public String getType() {
        return getClass().getSimpleName();
    }

    protected void fly() {
        System.out.println(getClass().getSimpleName() + " летит");
    }

    protected void swim() {
        System.out.println(getClass().getSimpleName() + " плывёт");
    }

    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s", nickname,birthDate, owner, illness);
    }
}
