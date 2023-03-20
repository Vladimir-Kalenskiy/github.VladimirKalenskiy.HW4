package GBLinkedList.impl;

import GBLinkedList.GBLinkList;

import java.util.Iterator;

public class GBLinkedList<E> implements GBLinkList<E> {
    private int size;
    private Node<E> head;
    private Node<E> tail;

    public GBLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public GBLinkedList(E head) {
        this();
        addFirst(head);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(E data) {
        Node<E> temp = new Node<E>(data);
        if (isEmpty()) tail = temp;
        else head.prev = temp;

        temp.next = head;
        head = temp;
        size++;
    }

    @Override
    public void addLast(E data) {

        Node<E> temp = new Node<E>(data);

        if (isEmpty()) head = temp;
        else tail.next = temp;

        temp.prev = tail;
        tail = temp;
        size++;
    }

    @Override
    public E get(int i) {
        if (i >= size || i < 0) return null;
        else return getNode(i).data;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Iterator<E> iterator() {
        return new IteratorLL<>(head);
    }

    public Node<E> getNode(int i) {
        Node<E> current = head;

        for (int j = 0; j < i && current != null; j++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (size < 1) return sb.toString();

        sb.append("{");

        for (E el : this) {
            sb.append(el);
            if (el == tail.data) sb.append("}");
            else sb.append(", ");
        }
        return sb.toString();
    }
}
