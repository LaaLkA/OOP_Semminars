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

    @Override
    public String toString() {
        return String.format("%s %s %d %s", this.firstName, this.lastName, id, birthDate);
    }

    protected People(){
        this("ИмяЧеловека", "ФамилияЧеловека", -1, LocalDate.now());
    }
}
