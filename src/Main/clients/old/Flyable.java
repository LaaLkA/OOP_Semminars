package Main.clients.old;

public interface Flyable {
    void fly();

    default double getFlySpeed(){
        return 6D;
    }
}
