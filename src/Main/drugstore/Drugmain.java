package Main.drugstore;

import Main.drugstore.components.Azitromite;
import Main.drugstore.components.Penicillin;
import Main.drugstore.components.Water;

import java.util.*;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitromite = new Azitromite("Azitromite", 2D, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);

        Pharmacy2 p1 = new Pharmacy2();
        Pharmacy2 p2 = new Pharmacy2();
        Pharmacy2 p3 = new Pharmacy2();

        p1.addComponents(water, penicillin);
        p2.addComponents(penicillin, water);
        p3.addComponents(water, azitromite, penicillin);

        List<Component> components = new ArrayList<Component>();

        components.add(penicillin);
        components.add(azitromite);
        components.add(water);

        System.out.println(components);

        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);

//        Iterator<Component> iterator = p1;
//
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

        for (Component c: p2) {
            System.out.println(c);
        }
    }
}
