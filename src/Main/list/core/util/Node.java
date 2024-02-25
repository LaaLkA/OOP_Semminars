package Main.list.core.util;

public class Node<T> {
    public T value;
    public Node<T> next;
    public Node<T> previous;

    public Node(Node<T> previous, T value, Node<T> next){
        this.previous = previous;
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("previous - %s, value - %s, next - %s", previous, value, next);
    }
}
