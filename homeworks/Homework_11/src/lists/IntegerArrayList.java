package lists;

public class IntegerArrayList {

    int array[] = new int[10];

    void add(int element) {
        for (int i=0; i<array.length; i++) {
            if (array[i] != 0){
                array[i] = element;
            }
        }
    }

    int get(int index) {
        return -1;
    }

    void removeByIndex(int index) {

    }

    void removeByValue(int value) {

    }

    int indexOf(int value) {
        return -1;
    }
}