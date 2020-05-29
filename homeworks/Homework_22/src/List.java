public interface List<E> extends Collections<E>{
    E get(int index);
    void removeAt(int index);
    void insert (E element, int index);
}
