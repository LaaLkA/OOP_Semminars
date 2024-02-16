package Main.Personal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VeterinaryClinic {
    protected ArrayList<People> personalList = new ArrayList<People>();
    protected void addPersonal(People person){
        personalList.add(person);
    }
    protected static void  TakeGoSwimFly (ArrayList<People> personalList){
        ArrayList<People> personalCanAll = new ArrayList<>();
        for (People item : personalList) {
            if (item instanceof Swimable && item instanceof Goable && item instanceof Flyable) {
                personalCanAll.add(item);
            }
        }
        System.out.println("Персонал поликлиники, который может летать, бегать и плавать:");
        for (People item : personalCanAll) {
            System.out.println(item);
        }
    }
}
