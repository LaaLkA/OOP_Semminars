package Main.Personal;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Иван", "Иванов", 1, LocalDate.now(), "Кошки", "BigCat");
        Doctor doctor2 = new Doctor("Александр", "Иванов", 2, LocalDate.now(), "Собаки", "BigBoy");
        Nurse nurse1 = new Nurse();
        Nurse nurse2 = new Nurse("Юлия", "Александрова", 3, LocalDate.now(), doctor1.getSomething("lastname"));

        VeterinaryClinic vetClinic1 = new VeterinaryClinic();
        vetClinic1.addPersonal(doctor1);
        vetClinic1.addPersonal(doctor2);
        vetClinic1.addPersonal(nurse1);
        vetClinic1.addPersonal(nurse2);

        vetClinic1.TakeGoSwimFly(vetClinic1.personalList);
    }
}
