package vn.dataguard.queue;

public class CircularlyLinkedList <E> {
    private Node<E> tail = null;
    private int size = 0;

    public CircularlyLinkedList() {

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return tail.getNext().getElement(); // head is next element of tail
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void rotate() {
        if (tail != null)
            tail = tail.getNext();
    }

    public void addFirst(E e) {
        if (isEmpty()) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newNode = new Node<>(e, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext(); // 2 dong nay tuong tu nhu dong tren
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> first = tail.getNext();
        if (first == tail) { // chi co mot phan tu
            tail = null;
        } else {
            tail.setNext(first.getNext());
        }
        size--;
        return first.getElement();
    }

}
