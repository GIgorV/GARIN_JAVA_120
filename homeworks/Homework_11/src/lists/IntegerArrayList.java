package lists;

public class IntegerArrayList {

    int array[];
    int count = 0;

    // пока добавить не соответствует дз, т.к. описанный метод вводит следующий элемент (не вперед)
    public void add(int element) {
        if (element != -1) {
            array[count] = element;
            count++;
        }
    }

    public void print() {
        System.out.print("IntegerArrayList на текущий момент содержит следующие элементы: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    // возвращает значение по индексу
    int get(int index) {
        int result = array[index];
        return result;
    }

    void removeByIndex(int index) {
        for (int i = index; i < array.length-1; i++) {
            array[i] = array[i+1];
        }

    }

    void removeByValue(int value) {

    }
    //не корректно работает
    int indexOf(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value); {
                return i;
            }
        }
        return -1;
    }


    // конструктор
    IntegerArrayList() {
        this.array = new int[10];
    }
}
//for (int i=0; i<array.length; i++) {
//        int temp = array[i];
//        array[i+1] = temp;
//        }