package Main.Personal;

import java.time.LocalDate;

public abstract class People {
    String firstName;
    String lastName;
    int id;
    LocalDate birthDate;

    protected People(String firstName, String lastName, int id, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.birthDate = birthDate;
    }

    protected People(){
        this("ИмяЧеловека", "ФамилияЧеловека", -1, LocalDate.now());
    }
}
