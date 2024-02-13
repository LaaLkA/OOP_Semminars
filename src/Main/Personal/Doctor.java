package Main.Personal;

import java.sql.SQLOutput;

public class Doctor extends People implements Goable, Flyable, Swimable {
    String specialization;
    String patients;

    protected void treat (String patient) {
        System.out.println("The Doctor" + this.firstName + "" + this.lastName + " treats " + patient);
    }

    @Override
    public void fly() {
        System.out.println("Doctor can't fly. Only by plane");
    }

    @Override
    public void go() {
        System.out.println("Doctor going, Doctor's speed - " + getRunSpeed());
    }

    @Override
    public void swim() {
        System.out.println("The Doctor " + this.firstName + " can swim at a speed of " + getSwimSpeed());
    }

//    @Override
//    public String toString() {
//        return String.format("");
//    }
}
