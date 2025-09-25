package vn.dataguard.queue;

public class CircularQueueImpl<E> implements CircularQueue<E> {

    private CircularlyLinkedList<E> circularlyLinkedList = new CircularlyLinkedList<>();

    @Override
    public void rotate() {
        circularlyLinkedList.rotate();
    }

    @Override
    public int size() {
        return circularlyLinkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return circularlyLinkedList.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        circularlyLinkedList.addLast(e);
    }

    @Override
    public E first() {
        return circularlyLinkedList.first();
    }

    @Override
    public E dequeue() {
        return circularlyLinkedList.removeFirst();
    }
}
