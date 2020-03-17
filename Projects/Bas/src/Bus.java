public class Bus {
    private final int MAX_PASSENGER_COUNT = 5;
    private char namber[];
    private Passenger passengers[]; // чтобы автобус мог хранить список пассажиров
    private Driver driver;
    private int count;

    Bus(char namber[]){
        this.namber=namber; // здесь this помогает отделить поле от формального параметра
        this.passengers=new Passenger[MAX_PASSENGER_COUNT];
        this.count=0;
    }

    void addPassenger(Passenger passenger){
        if (count < MAX_PASSENGER_COUNT){
            this.passengers[count] = passenger;
            passenger.setBus(this); //this указывает на объект, из которого вызывается метод addPassenger и
                                // позволяет положить текущий автобус данному пассажиру
                    // теперь пассажир имеет автобус, а автобус пассажира в массиве всех пассажиров
            this.count++;
        }
    }

    void setDriver (Driver driver){
        this.driver=driver;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public Driver getDriver() {
        return driver;
    }

    public void start(){
        System.out.println("Whroom Whroom");
    }
}
