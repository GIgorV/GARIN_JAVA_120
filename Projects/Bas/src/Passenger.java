public class Passenger {
    private char name[]; // имя, как массив символов
    private Bus bus; // автобус, к которому относится данный пассажир

    Passenger(char name[]){ // в конструкторе просто будем передавать имя
        this.name=name;

    }

    void setBus(Bus bus){ // для того, чтобы класть сюда автобус
        this.bus= bus;
    }

    public char[] getName() {
        return name;
    }

    public Bus getBus() {
        return bus;
    }
}
