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
        Component azorubin = new Penicillin("Azorubin", 0.8D, 1);

        Pharmacy2 p1 = new Pharmacy2();
        Pharmacy2 p2 = new Pharmacy2();
        Pharmacy2 p3 = new Pharmacy2();
        Pharmacy2 p4 = new Pharmacy2();

        p1.addComponents(water);
        p2.addComponents(penicillin, water);
        p3.addComponents(azitromite, penicillin);
        p4.addComponents(penicillin, azorubin, azitromite);

        List<Pharmacy2> medicines = new ArrayList<>();

        medicines.add(p2);
        medicines.add(p1);
        medicines.add(p4);
        medicines.add(p3);

        System.out.println(medicines);

//        // Соритировка по суммарной силе лекарства
//        Collections.sort(medicines);
//        System.out.println(medicines);

        //Сортировка по количеству элементов в лекарстве
        Collections.sort(medicines);
        System.out.println(medicines);



//        System.out.println(components);
//
//        Collections.sort(components, Comparator.reverseOrder());
//        System.out.println(components);

//        Iterator<Component> iterator = p1;
//
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

//        for (Component c: p2) {
//            System.out.println(c);
//        }
    }
}
