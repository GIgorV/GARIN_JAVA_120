package linked;

public class LinkedList<T> implements List<T> {

    private static class Node<E> {
        E value;
        Node<E> next;

        Node(E value) {
            this.value = value;
        }
    }

    private int count;
    private Node<T> first;
    private Node<T> last;

    private class LinkedListIterator implements Iterator<T> {
        Node<T> current;

        LinkedListIterator() {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T value = current.value;
            current = current.next;
            return value;
        }
    }

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (this.first == null) {
            this.first = newNode;
            this.last = this.first;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }
        count++;
    }

    public T get(int index) {
        if (index >= 0 && index < count) {
            Node<T> current = first;
            for (int i = 1; i <= index; i++) { //добегает до нужного индекса
                current = current.next;
            }
            return current.value; //возвращает значение по индексу
        } else throw new IllegalArgumentException();
    }

    public void remove(T element) {
        Node<T> previous = null;
        Node<T> current = first;
        while (current != null) {
            if (current.value == element) {
                if (previous == null) {
                    first = current.next;
                    current = first;
                } else {
                    previous.next=current.next; // ?
                    current = current.next;
                }
                count--;
            } else {
                previous = current;
                current = current.next;
            }
        }
    }

    public void removeByIndex(int index) {
        if (index >= 0 && index < count) {
            Node<T> previous = null;
            Node<T> current = first;
            int currentIndex = 0;
            if (index == 0) {
                first = current.next;
            } else {
                while (currentIndex != index) {
                    previous = current;
                    current = current.next;
                    currentIndex++;
                }
                previous.next=current.next;
            }
            count--;
        } else throw new IllegalArgumentException();
    }

    public boolean contains(T element) { //содержит, cc
        Node<T> current = first;
        for (int i = 1; i < count; i++) {
            if (current.value == element) {
                return true;
            }
            i++;
        }
        return false;
    }

    //метод, который возвращает итератор
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    @Override
    public int size() {
        return count;
    }
}
