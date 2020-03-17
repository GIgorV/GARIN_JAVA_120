package array;

public interface IntegerList { // from Itis_9
    // добавление элемента в конец списка
    void add(int element);
    // получение элемента из списка по индексу
    int get(int index);
    // получение размера текущего списка
    int size();
    // проверить наличие этого элемента в списка
    boolean contains(int element);
    // удаление элемента по индексу
    void remove(int index);
}
