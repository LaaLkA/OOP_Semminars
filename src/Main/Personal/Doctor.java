package Main.Personal;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Doctor extends People implements Goable, Flyable, Swimable {
    String specialization;
    String patients;
    protected Doctor(String firstName, String lastName, int id, LocalDate birthDate, String specialization, String patients) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.specialization = specialization;
        this.patients = patients;
    }
    protected Doctor(){
        this("ИмяВрача", "ФамилияВрача", -1, LocalDate.now(), "СпециализацияВрача", "ПациентовВрача");
    }
    protected String getSomething (String whatReturn) {
        switch (whatReturn) {
            case "firstName":
                return this.firstName;
            case "lastName":
                return this.lastName;
            case "birthDate":
                return this.birthDate.toString();
            case "specialization":
                return this.specialization;
            case "patients":
                return this.patients;
            default:
                return null;
        }
    }
    protected void treat (String patient) {
        System.out.println("The Doctor" + this.firstName + " " + this.lastName + " treats " + patient);
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
    @Override
    public String toString() {
        return String.format("%s %s, %s, %s, %s", this.firstName, this.lastName, this.birthDate.toString(), this.specialization, this.patients);
    }

//    @Override
//    public String toString() {
//        return String.format("");
//    }
}
