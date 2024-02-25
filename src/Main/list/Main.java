package Main.list;

import Main.list.core.impl.GBLinkedList;

public class Main {
    public static void main(String[] args) {
//        GBList<Integer> list = new GBArrayList<>();
//
//        list.add(1);
//        list.add(22);
//        list.add(673);
//        System.out.println(list);
//
//        System.out.println(list.get(1));
//
//        list.remove(1);
//        System.out.println(list);
//
//        System.out.println(list.size());

        GBLinkedList<Integer> linkedList = new GBLinkedList<>();

        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        linkedList.print();

        linkedList.remove(3);
        linkedList.print();

        System.out.println(linkedList.get(3));
    }
}
