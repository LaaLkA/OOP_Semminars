package Main.list.core.impl;

import Main.list.core.util.ArrayIterator;
import Main.list.core.util.Node;

import java.util.Arrays;
import java.util.Iterator;

public class GBLinkedList<T> {
    private Node<T> head;
    private int size;

    private boolean isOutofBound(int index) {
        return index < 0 || index >= size;
    }


    public void addFirst(T elem) {
        Node<T> newNode = new Node<T>(null, elem, head);

        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;
        size++;
    }


    public void remove(int index) {
        if (isOutofBound(index)) {
            System.out.println("Index " + index + " But size - " + size);
            ;
        }
        if (index == 0) {
            head = head.next;
            head.previous = null;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.next != null) {
                current.next.previous = current.previous;
                current.previous.next = current.next;
            }
        }
        size--;
    }

    public int size() {
        return size;
    }


    public T get(int index) {
        Node<T> current = head;
        if (isOutofBound(index)) {
            return null;
        }
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public T[] toArray() {
        T[] result = null;
        try {
            result = (T[]) new Object[size];
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < size; i++) {
            result[i] = get(i);
        }
        return result;
    }

    public void print() {
        System.out.println(Arrays.toString(toArray()));
    }

    public Iterator<T> iterator() {
        return new ArrayIterator<>(toArray());
    }


}
