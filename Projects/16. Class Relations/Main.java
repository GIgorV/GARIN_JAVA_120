

public class Main {

    public static void main(String[] args) {
	    Engine engine = new Engine("Bugatti", 7.9);
	    Driver driver = new Driver("�������", 25);
	    Car car = new Car("���-2114", 1000, 777, engine);
	    car.setDriver(driver);
	    driver.ride();
    }
}