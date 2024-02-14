package Main.Personal;

public interface Goable {
    void go();

    default double getRunSpeed(){
        return 8D;
    }

}
