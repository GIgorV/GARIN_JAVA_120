package linkedT;

public interface Iterator<T> {
    boolean hasNext(); // есть ли следующий
    T next(); // следующий, каждый раз сдвигает итератор, оссобеность: итератор указывает не на объект, а между ними
}
