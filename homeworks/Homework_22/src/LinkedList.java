public class LinkedList<E> implements List<E> {

    private int size = 0;
    private Node<E> head;
    private Node<E> tail;

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    private class LinkedListIterator implements Iterator<E> {
        Node<E> current;

        LinkedListIterator() {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E value = current.value;
            current = current.next;
            return value;
        }
    }

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        size++;
    }

    @Override
    public E get(int index) {
        if (size > 0 && index < size && index >= 0) {
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;
        } else throw new IllegalArgumentException();
    }

    public void remove(E element) {
        Node<E> previous = null;
        Node<E> current = head;
        while (current != null) {
            if (current.value == element) {
                if (previous == null) {
                    head = current.next;
                    current = head;
                } else {
                    previous.next = current.next;
                    current = current.next;
                }
                size--;
            } else {
                previous = current;
                current = current.next;
            }
        }
    }

    public void removeByIndex(int index) {
        if (index <= size) {

        } else {
            System.out.println("Element not found");
        }
    }

    public void removeAt(int index) {

    }


    @Override
    public boolean contains(E element) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.value == element) {
                return true;
            } else {
                current = current.next;
            }
        }
//        throw new IllegalArgumentException("Element not found");
        return false;
    }

    public void insert(E element, int index) {

    }

    public int size() {
        return size();
    }

    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }
}
