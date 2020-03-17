public class Main {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Passenger1".toCharArray()); //создаем несколько пассажиров, имя переводим в массив символов
        Passenger passenger2 = new Passenger("Passenger2".toCharArray());
        Passenger passenger3 = new Passenger("Passenger3".toCharArray());
        Driver driver = new Driver("Driver".toCharArray());

        Bus bus = new Bus("a001aa".toCharArray());
        bus.addPassenger(passenger1);
        bus.addPassenger(passenger2);
        bus.addPassenger(passenger3);

        bus.setDriver(driver); //у автобуса может быть водитель
        driver.setBus(bus); //у водителя может быть автобус

        driver.ride();
    }
}
