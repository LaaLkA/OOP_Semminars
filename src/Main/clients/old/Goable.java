package Main.clients.old;

public interface Goable {
    void go();

    default double getRunSpeed(){
        return 8D;
    }

}
