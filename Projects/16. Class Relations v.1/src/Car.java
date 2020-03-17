public class Car {
    private String model;
    private int weight;
    private int carNumber;
    private Driver driver; //агрегирование
    private Engine engine;

    public Car(String model, int weight, int carNumber, Engine engine) {
        this.model = model;
        this.weight = weight;
        this.carNumber = carNumber;
        this.engine = engine;
        engine.setCar(this);
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
        driver.addCar(this);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void beginMove(){
        System.out.println(driver.getName() + " поехал");
        engine.start();
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

}
