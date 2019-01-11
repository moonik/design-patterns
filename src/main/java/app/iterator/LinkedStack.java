package app.iterator;

import java.util.Iterator;

public class LinkedStack<T> implements Iterable<T> {

    private Node pointer;

    public class Node<T> {
        private T item;
        private Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        public T getItem() {
            return item;
        }

        public Node getNext() {
            return next;
        }
    }

    public boolean push(T item) {
        pointer = new Node(item, pointer);
        return true;
    }

    public T pop() {
        T item = (T) pointer.getItem();
        pointer = pointer.getNext();
        return item;
    }

    /*
      Iterator example
     */
    @Override
    public Iterator<T> iterator() {
        return new LinkedStackIterator();
    }

    private class LinkedStackIterator implements Iterator<T> {
        private Node current = pointer;

        @Override
        public boolean hasNext() {
            return current.getNext() != null;
        }

        @Override
        public T next() {
            T item = (T) current.getItem();
            current = current.getNext();
            return item;
        }
    }

    public static void main(String[] args) {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        linkedStack.push(1);
        linkedStack.push(2);
    }
}
