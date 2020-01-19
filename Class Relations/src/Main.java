public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Bugatti", 7.9);
        Driver driver = new Driver("Igor", 40);
        Car car = new Car("LADA", 1000, 777, engine);
        car.setDriver(driver);
        driver.ride();
    }
}
//01:09