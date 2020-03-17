package linked;


public interface Iterable<T> { //значит, что коллекция итерируема
    Iterator<T> iterator();     // метод, который для коллекции возвращает ее итератор и уже сам итератор будет "гулять"
}
