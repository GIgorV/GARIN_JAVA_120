
public class SignUpForm {
    private String nameDriver;
    private String model;

    public SignUpForm(String nameDriver, String model) {
        this.nameDriver = nameDriver;
        this.model = model;
    }

    public String getnameDriver() {
        return nameDriver;
    }

    public void setnameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}