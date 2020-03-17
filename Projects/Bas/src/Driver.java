public class Driver {
    private char name[];
    private Bus bus;

    Driver(char name[]){
        this.name = name;
    }

    void setBus (Bus bus){
        this.bus= bus;
    }

    public void ride(){
        bus.start();
    }
}
