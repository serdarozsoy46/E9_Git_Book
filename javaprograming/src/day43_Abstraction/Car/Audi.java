package day43_Abstraction.Car;

public  final class Audi extends Car {

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    public void stop() {
        System.out.println("Pres break");
    }

    public void start() {
        System.out.println("Push the starr button");
    }

    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+"has auto park feature");
    }


}
