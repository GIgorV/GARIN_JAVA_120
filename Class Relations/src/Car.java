public class Car {
    private String model;
    private int weight;
    private int CarNumber;
    private Driver driver; //агрегирование
    private Engine engine;

    public Car(String model, int weight, int carNumber, Engine engine) {
        this.model = model;
        this.weight = weight;
        this.CarNumber = carNumber;
        this.engine = engine;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int getCarNumber() {
        return CarNumber;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }
    public void beginMove(){
        engine.start();
    }
}
