package array;

public class ArrayList {
    private int array[];
    private int count; //актуальная длина списка

    ArrayList(int arrayLength) {     // конструктор
        this.array = new int[arrayLength];
        this.count = 0;
    }

    public void add(int element) {
        if (count == array.length) {
            resize();
        }
        if (element != -1) {
            array[count] = element;
            count++;
        }
    }

    public void addToBegin(int element) { // - тяжело добавлять в начало
        if (count == array.length) { // или можно наоборот: if (size < elements.length) {
            resize(); // - ограниченный размер, увеличиваем размер
            array[count] = element;
        }
        if (element != -1) {
            for (int i = count; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = element;
        }
        count++;
    }

    // очень быстрый доступ к элементу по его номеру
    int get(int index) { // возвращает значение по индексу
        if (index < array.length && array[index] != 0) {
            int result = array[index];
            System.out.println("Под индексом " + index + " находится элемент " + array[index]);
            return result;
        } else {
            System.err.println("Не верный индекс");
            return -1;
        }
    }

    public void removeByIndex(int index) { //удалить по индексу
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

    }

    public void removeByValue(int value) { //браво! сам сделал!
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("Обнаружен искомый элемент " + value + " под индексом " + i);
                removeByIndex(i);
            }
        }
        print();
    }

    int indexOf(int value) { //индекс элемента по значению
        if (value <= count) {
            System.out.println("Под индексом " + value + " обнаружен элемент " + array[value]);
            return array[value];
        }
        return -1;
    }

    public void print() {
        System.out.print("IntegerArrayList на текущий момент содержит следующие элементы: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public int size() {
        return count;
    }

    public void resize() { //увеличить массив
        int array_new[] = new int[(int) (array.length * 1.5)]; // или можно new int[elements.length + elements.length / 2];
        for (int i = 0; i < array.length; i++) {
            array_new[i] = array[i];
        }
        this.array = array_new;
    }
}

