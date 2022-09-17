package day43_Abstraction.Car;

public final class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void stop() {
        System.out.println("Say stop");
    }

    public void start() {
        System.out.println("Say \"Start\"");
    }
    public final void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+"has auto Pilot feature");
    }

}
