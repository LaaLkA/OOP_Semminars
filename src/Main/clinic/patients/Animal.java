package Main.clinic.patients;

public class Animal{
    public String name;
    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Animal %s", name);
    }
}
