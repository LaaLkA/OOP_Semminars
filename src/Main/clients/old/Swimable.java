package Main.clients.old;

public interface Swimable {
    void swim();

    default double getSwimSpeed(){
        return 5D;
    }
}
