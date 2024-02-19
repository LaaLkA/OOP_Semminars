package Main.clinic.patients;

public interface Swimable {
    void swim();

    default double getSwimSpeed(){
        return 5D;
    }
}
