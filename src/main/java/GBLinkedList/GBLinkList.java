package GBLinkedList;

public interface GBLinkList<E> extends Iterable<E> {
    int size();

    void addFirst(E data);

    void addLast(E data);

    E get(int i);

    boolean isEmpty();
}
