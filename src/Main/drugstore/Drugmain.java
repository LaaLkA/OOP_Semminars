package Main.drugstore;

import Main.drugstore.components.Azitromite;
import Main.drugstore.components.Penicillin;
import Main.drugstore.components.Water;

import java.util.Iterator;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitromite = new Azitromite("Azitromite", 2D, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);

        Pharmacy p1 = new Pharmacy();
        Pharmacy p2 = new Pharmacy();

        p1.addComponents(water, azitromite, penicillin);
        p2.addComponents(penicillin, water);

        Iterator<Component> iterator = p1;

        while (iterator.hasNext()) {
            System.out.println(p1.next().toString());
        }
    }
}
