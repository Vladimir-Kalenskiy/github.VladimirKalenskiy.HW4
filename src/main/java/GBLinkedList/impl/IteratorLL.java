package GBLinkedList.impl;

import java.util.Iterator;

public class IteratorLL<E> implements Iterator<E> {

    private Node<E> current;

    public IteratorLL(Node<E> current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public E next() {
        E temp = current.data;
        current = current.next;
        return temp;
    }
}