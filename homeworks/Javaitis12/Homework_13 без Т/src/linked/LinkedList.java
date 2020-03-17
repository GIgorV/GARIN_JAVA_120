package linked;

import nodes.Node;

public class LinkedList {
    Node first;
    private Node last;
    private int count;

    public LinkedList() {

    }

    public void add(int element) { // добавляет в конец
        Node newNode = new Node(element);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        count++;
    }

    public void addToBegin(int element) {
        Node newNode = new Node(element);
//        if (count == 0) {        // cc, работает
//            first = newNode;
//            last = newNode;
//        } else {
//            Node temp = first;
//            first = newNode;
//            first.setNext(temp);}
        newNode.setNext(first);
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

    public int size() {
        return count;
    }
}
