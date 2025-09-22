package vn.dataguard.queue;

public class ArrayQueue<E> implements Queue<E> {

    private E[] data;
    private int front;
    private int size;

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
        front = 0;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        if (size >= data.length) {
            throw new RuntimeException("Overflow");
        }
        int f = (front + size) % data.length;
        data[f] = e;
        size++;
    }

    @Override
    public E first() {
        return data[front];
    }

    @Override
    public E dequeue() {
        if (size == 0) {
            return null;
        }
        E e = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size --;
        return e;
    }
}
