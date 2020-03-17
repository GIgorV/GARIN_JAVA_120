public class Driver {
    private String name;
    private int age;
    private Car car;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
        //this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void ride(){
        car.beginMove();
    }

}
