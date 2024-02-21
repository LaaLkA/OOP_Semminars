package Main.list;

import Main.list.core.GBList;
import Main.list.core.impl.GBArrayList;

public class Main {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();

        list.add(1);
        list.add(22);
        list.add(673);
        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(1);
        System.out.println(list);

        System.out.println(list.size());
    }
}
