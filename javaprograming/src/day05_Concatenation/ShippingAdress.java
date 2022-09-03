package day05_Concatenation;

public class ShippingAdress {
    public static void main(String[] args) {

       String name = "James",
              buldingNumber = "11821B",
              streetName = "Jones Branch Dr",
              city = "McLean",
              state = "VA",
               zipCode = "22031A";
        System.out.println(name + "\n" + buldingNumber+" " + streetName +"\n" + city +", " + state +" " + zipCode);
       String address =name + "\n" + buldingNumber+" " + streetName +"\n" + city +", " + state +" " + zipCode;
        System.out.println(address);

    }




}
