package linkedT;

//import nodes.Node;

public class LinkedList<T> implements List<T> {

    private static class Node<E> {
        E value;
        Node<E> next;

        Node(E value) {
            this.value = value
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

    public void addToBegin(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next(first);
        first = newNode;
        count++;
    }

    public int get(int index) {
        if (index >= 0 && index < count) {
            Node current = first;
            for (int i = 1; i <= index; i++) { //добегает до нужного индекса
                current = current.getNext();
            }
            return current.getValue(); //возвращает значение по индексу
        } else {
            System.out.println("Нет такого индекса");
            return -1;
        }
    }

    public void remove(int element) { //списал
        Node previous = null;
        Node current = first;
        while (current != null) { //Список может быть пустым, или значение, которое мы передаем в метод может не присутствовать в списке. В этом случает список останется без изменений.
            if (current.getValue() == element) { //Удаляемый узел может быть единственным в списке. В этом случае мы установим значения полей _head и _tail равными null.
                if (previous == null) { //Удаляемый узел будет в начале списка. В этом случае мы записываем в _head ссылку на следующий узел.
                    first = current.getNext();
                    current = first;
                } else { //Удаляемый узел будет в середине списка.
                    previous.setNext(current.getNext());
                    current = current.getNext();
                }
                count--;
            } else {
                previous = current;
                current = current.getNext();
            }
        }//Удаляемый узел будет в конце списка. В этом случае мы записываем в _tail ссылку на предпоследний узел, а в его поле Next записываем null.
    }

    public void removeByIndex(int index) { //списал, разобрать
        if (index >= 0 && index < count) {
            Node previous = null;
            Node current = first;
            int currentIndex = 0;
            if (index == 0) {
                first = current.getNext();
            } else {
                while (currentIndex != index) {
                    previous = current;
                    current = current.getNext();
                    currentIndex++;
                }
                previous.setNext(current.getNext());
            }
            count--;
        } else {
            System.out.println("Нет такого индекса");
        }
    }

    public boolean contains(int element) { //содержит, cc
        Node current = first;
        for (int i = 1; i < count; i++) {
            if (current.getValue() == element) {
                return true;
            }
            i++;
        }
        return false;
    }

//    @Override
//    public Iterator<T> iterator(){
//        return new LinkedListIterator();
//    }

    public int size() {
        return count;
    }
}
