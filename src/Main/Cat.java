package Main;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {
    Double discount;

    public Cat(String nickname, Owner owner, LocalDate birthDate, Illness illustrious, double discount) {
        super(nickname, owner, birthDate, illustrious);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    @Override
    public void eat() {
        System.out.println("Кошка поймала мышку и кушает");
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Discount(" + discount +")";
    }

    public static void meow() {
        System.out.println(" Meow!");
    }

    @Override
    public void fly() {
        System.out.println("Кошки не умеют летать!");
    }

    @Override
    public void toGo() {
        System.out.println("Кошка" + nickname + "идёт куда-то");
    }

    @Override
    public void hunt() {
        System.out.println("Кошка" + nickname + "охотится на кого-то");
    }
}
