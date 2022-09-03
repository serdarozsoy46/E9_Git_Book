package day40_FinalKeyword;

public class Zoo {

    public static void main(String[] args) {


        Dog dog = new Dog("Max","Husky",'M',"White","Large",3);

        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();


    }






}
