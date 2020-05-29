public class LinkedList<T> {

    private static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }

    private int count;
    private Node<T> first;
    private Node<T> last;

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
        if (index <= count) {
            Node<T> current = first;
            for (int i = 1; i <= index; i++) {
                current = current.next;
            }
            return current.value;
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
                    previous.next = current.next;
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
        if (index <=count){

        }else {
            System.out.println("Element not found");
        }
    }

    public int contains(T element) {
        Node<T> current = first;
        for (int i = 0; i < count; i++) {
            if (current.value == element) {
                return i;
            } else {
                current = current.next;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }


    public int size() {
        return count;
    }
}
