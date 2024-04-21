package vn.dataguard.list;

import java.util.LinkedList;

public class LinkedListTest<T> {
    private NodeLinkedList<T> head;
    private NodeLinkedList<T> tail;
    private int size;

    public LinkedListTest() {

    }

    public void add(T t) {
        if (head == null) {
            head = new NodeLinkedList<>(t);
        } else {
            if (tail == null) {
                tail = new NodeLinkedList<>(t);
            } else {
                NodeLinkedList<T> temp = new NodeLinkedList<>(t);
                tail.setNext(temp);
                tail = temp;
            }
        }
        size++;
    }
}
