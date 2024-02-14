package Main.Personal;

public interface Flyable {
    void fly();

    default double getFlySpeed(){
        return 6D;
    }
}
