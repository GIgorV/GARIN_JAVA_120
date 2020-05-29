
public class ArrayList<K> implements List<K> {
    private static final int DEFAULT_LENGTH = 10;
    private K elements[];
    private int size = 0;

    public ArrayList() {
        this.elements = (K[]) new Object[DEFAULT_LENGTH];
        this.size = 0;
    }

    @Override
    public K get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        throw new IllegalArgumentException("Неверный индекс");
    }

    @Override
    public void add(K element) {
        if (notCorrectSize()) {
            resize();
        }
        elements[size] = element;
        size++;
    }

    public boolean notCorrectSize() {
        return size == elements.length;
    }

    public void resize() {
        K newElements[] = (K[]) new Object[elements.length + elements.length / 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        this.elements = newElements;
    }

    @Override
    public boolean contains(K element) {
        for (int i=0; i <size; i++){
            if (elements[i] == element){
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(K element) {

    }

    public void removeAt(int index) {

    }

    public void insert(K element, int index) {

    }

    public int size() {
        return size;
    }

    public Iterator<K> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<K> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public K next() {
            if (hasNext()) {
                return elements[index++];
            }
            return null;
        }
    }

    public void print(){
        for (int i=0; i<size; i++){
            System.out.print(elements[i]+" ");
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
