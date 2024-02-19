package Main.clinic;

import Main.clinic.core.Clinic;
import Main.clinic.patients.impl.Cat;
import Main.clinic.patients.impl.Dog;
import Main.clinic.patients.impl.Parrot;
import Main.clinic.personal.impl.Doctor;
import Main.clinic.patients.Animal;
import Main.clinic.personal.impl.Nurse;

public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();

//        System.out.println(clinic.getPatients());
//        System.out.println(clinic.getPersonal());

        Animal pet = new Animal("Кузя");
        Doctor doctor1 = new Doctor("Петр");
        Doctor doctor2 = new Doctor("Петр1", new Nurse());
        Nurse nurse = new Nurse("Петр", "Петрович");

        Cat cat = new Cat("КОтик");
        Dog dog = new Dog("Собачка");
        Parrot parrot = new Parrot("Попугайчик");

        clinic.addPatient(cat);
        clinic.addPatient(dog);
        clinic.addPatient(parrot);

        clinic.addEmployee(doctor1);
        clinic.addEmployee(doctor2);
        clinic.addEmployee(nurse);

        System.out.println(doctor1.doDiagnose(pet));

        System.out.println("Могут ходить \t" + clinic.getGoables());
        System.out.println("Могут летать \t" + clinic.getFlyables());
        System.out.println("Могут плавать \t" + clinic.getSwimables());
        System.out.println("Могут охотиться \t" + clinic.getHuntables());
    }
}
