package Main.Personal;

public interface Swimable {
    void swim();

    default double getSwimSpeed(){
        return 5D;
    }
}
