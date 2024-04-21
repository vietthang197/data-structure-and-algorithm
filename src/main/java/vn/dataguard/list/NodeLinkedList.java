package vn.dataguard.list;

public class NodeLinkedList<T> {
    private T data;
    private NodeLinkedList<T> next;

    public NodeLinkedList() {

    }

    public NodeLinkedList(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeLinkedList<T> getNext() {
        return next;
    }

    public void setNext(NodeLinkedList<T> next) {
        this.next = next;
    }
}
