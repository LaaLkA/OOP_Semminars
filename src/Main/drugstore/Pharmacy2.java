package Main.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy2 implements Iterable<Component>, Comparable<Pharmacy2> {
    private List<Component> components = new ArrayList<Component>();
    private int index = 0; // И без указания он изначально равен 0

    public void addComponents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }

//    public Integer sumPower(){
//        int sumPower = 0;
//        for (Component c : components) {
//            sumPower += c.getPower();
//        }
//        return sumPower;
//    }


//    @Override
//    public boolean hasNext() {
//            return index < components.size();
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return String.format("%s", components);
    }

    @Override
    public int compareTo(Pharmacy2 o) {
        int sumPower = 0;
        for (Component c : this.components) {
            sumPower += c.getPower();
        }
        int oSumPower = 0;
        for (Component c : o.components) {
            oSumPower += c.getPower();
        }
        if (sumPower > oSumPower) {
            return 1;
        } else if (sumPower < oSumPower) {
            return -1;
        } else return 0;
    }

//    Сортировка по количеству компонентов в лекарстве
//    @Override
//    public int compareTo(Pharmacy2 o) {
//        return Integer.compare(this.components.size(), o.components.size());
//    }
}
