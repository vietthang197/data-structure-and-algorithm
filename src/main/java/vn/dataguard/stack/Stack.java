package vn.dataguard.stack;

public interface Stack<T> {
    void push(T item);

    int size();

    T pop();

    T top();

    boolean isEmpty();
}
