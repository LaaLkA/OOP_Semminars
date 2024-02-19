package Main.clinic.patients;

public interface Flyable {
    void fly();

    default double getFlySpeed(){
        return 6D;
    }
}
