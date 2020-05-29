import java.util.Observer;

public interface Observable { // наблюдаемый
    void addObserver(Observer observer); //наблюдатель, который будет наблюдать на Observable
    void notifyObservers(); //оповестить своего наблюдателя
}
