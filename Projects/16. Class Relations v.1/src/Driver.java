public class Driver {
    private static final int MAX_CARS_COUNT = 5;
    private String name;
    private int age;
    private Car cars[];
    private int carsCount = 0;
    private Car currentCar;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
        this.cars = new Car[MAX_CARS_COUNT];
    }

    public void addCar(Car car) {
        for (int i = 0; i < MAX_CARS_COUNT; i++) {
            if (currentCar == cars[i]) {
                System.err.println("Такая машина уже есть");
                return;
            }
        }
        if (carsCount < MAX_CARS_COUNT) {
            cars[carsCount] = car;
            carsCount++;
        } else {
            System.err.println("Слишком много машин");
        }
//        for (int i=0; i<MAX_CARS_COUNT; i++){
//            if (currentCar == cars[i]){
//                System.err.println("Такая машина уже есть");
//                return;
//            }
//        }
    }

    public void chooseCar(int carNumber) {
        for (int i = 0; i < carsCount; i++) {
            if (cars[i].getCarNumber() == carNumber) {
                this.currentCar = cars[i];
                return;
            }
        }
        System.err.println("Такая машина не найдена");
    }

    public void ride() {
        currentCar.beginMove();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Car getCurrentCar() {
        return currentCar;
    }
}
