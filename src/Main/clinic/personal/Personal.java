package Main.clinic.personal;

public class Personal {
    protected String firstName;
    protected String lastName;

    protected Personal(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    protected Personal() {
        this.firstName = "Имя";
        this.lastName = "Фамилия";
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
}
