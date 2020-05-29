package models;

public class Car { //пока говорит, обойдемся
    private String model;
    private String number;
    private String color;

    private Car(Builder builder){
        this.model=builder.model;
        this.number=builder.number;
        this.color=builder.color;
    }

    public static class Builder {
        private String model;
        private String number;
        private String color;

        public Builder model(String model){
            this.model=model;
            return this;
        }
        public Builder number(String number){
            this.number=number;
            return this;
        }
        public Builder color(String color){
            this.color=color;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }
    public static Builder builder(){
        return new Builder();
    }

}
