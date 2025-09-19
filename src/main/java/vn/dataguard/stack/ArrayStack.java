package vn.dataguard.stack;

public class ArrayStack<T> implements Stack<T> {
    private T[] data ;
    private static final int CAPACITY = 1000;
    private int t = -1; // index of top

    public ArrayStack() {
        this.data = (T[]) new Object[CAPACITY];
    }

    @Override
    public void push(T item) {
        if (size() == data.length) {
            throw new StackOverflowError();
        }
        data[++t] = item;
    }

    @Override
    public int size() {
        return t + 1;
    }

    @Override
    public T pop() {
        if (t == -1) {
            return null;
        }
        T item = data[t];
        data[t--] = null;
        return item;
    }

    @Override
    public T top() {
        if (t == -1) {
            return null;
        }
        return data[t];
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }
}
