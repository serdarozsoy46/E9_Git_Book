package day37_Inheritance.phoneTask;

public final class Nokia extends Phone{


    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefens(){
        System.out.println("You can use "+brand+" "+model+" as self defens tool");
    }



}
/*

selfDefens()
 */