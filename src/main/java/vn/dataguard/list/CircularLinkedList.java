package vn.dataguard.list;

public class CircularLinkedList<T> {
    public static class Node<E> {
        private E element;
        private Node<E> next;

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node(E element) {


            this.element = element;
        }

        @Override
        public String toString() {
            return String.valueOf(element);
        }
    }

    private Node<T> tail = null;
    private int size = 0;

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node<T> getFirst() {
        return tail.next;
    }

    public Node<T> getLast() {
        if (size == 0)
            return null;
        return tail;
    }

    public void rotate() {
        if (tail != null) {
           tail = tail.getNext();
        }
    }

    public void addFirst(T data) {
        if (size == 0) {
            tail = new Node<>(data);
            tail.setNext(tail);
        } else {
            Node<T> oldFirst = tail.getNext();
            Node<T> newFirst = new Node<>(data);
            newFirst.setNext(oldFirst);
            tail.setNext(newFirst);
        }
        size ++;
    }

    public void addLast(T data) {
       if (size == 0) {
           tail = new Node<>(data);
           tail.setNext(tail);
       } else {
           Node<T> newTail = new Node<>(data);
           Node<T> first = tail.getNext();
           newTail.setNext(first);
           tail.setNext(newTail);
           tail = newTail;
       }
       size ++;
    }

    public static void main(String[] args) {
        CircularLinkedList<String> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.addLast("A");
        circularLinkedList.addLast("B");
        circularLinkedList.addLast("C");
        circularLinkedList.addLast("D");
        printCircularLinkedList(circularLinkedList);
        circularLinkedList.rotate();
        System.out.println("############");
        printCircularLinkedList(circularLinkedList);
        circularLinkedList.rotate();
        System.out.println("############");
        printCircularLinkedList(circularLinkedList);

    }

    public static void printCircularLinkedList(CircularLinkedList<String> circularLinkedList) {
        Node<String> firstNode = circularLinkedList.getFirst();
        Node<String> currentNode = null;
        while (currentNode != firstNode) {
            if (currentNode == null) {
                System.out.println(firstNode.element);
                currentNode = firstNode.getNext();
            }
            else {
                System.out.println(currentNode.element);
                currentNode = currentNode.getNext();
            }
        }
    }
}
