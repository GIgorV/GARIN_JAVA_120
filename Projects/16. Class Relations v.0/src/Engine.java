public class Engine {
    private String brand;
    private double volume;
    private Car car;

    public Engine(String brand, double volume) {
        this.brand = brand;
        this.volume = volume;
    }

    public void setCar(Car car){
        this.car=car;
    }

    public String getBrand() {
        return brand;
    }

    public double getVolume() {
        return volume;
    }

    public Car getCar() {
        return car;
    }

    public void start(){
        System.out.println("Whroom Whroom");
    }
}
