package Main.Personal;

import java.time.LocalDate;

public class Nurse extends People implements Goable, Flyable, Swimable {
    String assignedNameDoctor;
    protected Nurse(String firstName, String lastName, int id, LocalDate birthDate, String assignedNameDoctor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.birthDate = birthDate;
        this.assignedNameDoctor = assignedNameDoctor;
    }
    protected Nurse(){
        this("ИмяМедсестры", "ФамилияМедсестры", -1, LocalDate.now(), "ФамилияВрача");
    }

    @Override
    public void fly() {
        System.out.println("Nurse can't fly. Only by plane");
    }

    @Override
    public void go() {
        System.out.println("Nurse's going. Nurse's speed - " + getRunSpeed());
    }

    @Override
    public void swim() {
        System.out.println("Nurse can swim at a speed of " + getSwimSpeed());
    }
}
