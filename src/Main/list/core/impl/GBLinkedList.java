package Main.list.core.impl;

import Main.list.core.GBList;

import java.util.Iterator;

public class GBLinkedList<T> implements GBList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> previous;

        public Node(Node<T> previous, T value, Node<T> next) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    @Override
    public void add(T elem) {
        Node<T> newNode = new Node<>(null, elem, null);
        if (head != null) {
            head.next = newNode;
            newNode.previous = head;
        }
        head = newNode;
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            head = head.next;
            head.previous = null;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
                //2.24 sem5
            }
        }
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
