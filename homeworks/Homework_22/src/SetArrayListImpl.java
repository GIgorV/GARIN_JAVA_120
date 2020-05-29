public class SetArrayListImpl<T> extends ArrayList<T> implements Set<T> {

    private ArrayList<T> arrayList;
//    private static final int DEFAULT_LENGTH = 10;
//
//    private T elements[];
//    private int size = 0;

    public SetArrayListImpl() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        if (arrayList.notCorrectSize()) {
            resize();
        }
        for (int i = 0; i < size; i++) {
            if (!elements[i].equals(element)) {
                elements[size] = element;
                size++;
            }
        }
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }
//
//    private boolean notCorrectSize() {
//        return size == elements.length;
//    }
//
//    private void resize() {
//        T newElements[] = (T[]) new Object[elements.length + elements.length / 2];
//        for (int i = 0; i < elements.length; i++) {
//            newElements[i] = elements[i];
//        }
//        this.elements = newElements;
//    }
}