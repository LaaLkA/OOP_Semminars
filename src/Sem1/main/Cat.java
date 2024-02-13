package Sem1.main;

import java.time.LocalDate;

public class Cat extends Animal {
    // Todo Напомнитть в чём разница в double
    Double discount;

    public Cat(String nickname, Owner owner, LocalDate birthDate, Illness illness, double discount) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
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
}
