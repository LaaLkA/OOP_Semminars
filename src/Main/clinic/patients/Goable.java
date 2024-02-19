package Main.clinic.patients;


public interface Goable {
    void go();

    default double getRunSpeed(){
        return 8D;
    }
}
