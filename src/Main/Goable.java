package Main;

@FunctionalInterface
public interface Goable {

//    List<Integer> pi = new ArrayList<Integer>();

    void toGo();

    default double getRunSpeed(){
        return 10D;
    }
}
