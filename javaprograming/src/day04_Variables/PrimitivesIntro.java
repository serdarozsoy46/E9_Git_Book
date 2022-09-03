package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old

        byte age = 38;

        // weight: 168 pounds
        // byte weight = 168;  // 168 is out of byte` range
        // byte num = -129;  // -129 is out of byte` range
        short weight= 168; // 168 is within the range of short
        // salary: 100000 $
        //short salary= 100000; // 100000 is out of short` range
        int salary= 100000;  // int is the preferred data type for integer number

        long asset = 3_333_333_333L;

        //tax:0.26
        float tax=0.26F;
        double PI=3.14;

         char ch1 = '#';
        System.out.println("ch1 = " + ch1);
         char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3= 35000;
        System.out.println("ch3 = " + ch3);
        char gender= 'F';
        char grade= 'F';
        char YesNo= 'Y';
        System.out.println("YesNo = " + YesNo);
        System.out.println("grade = " + grade);
        System.out.println("gender = " + gender);
        boolean isEmployeed = true;
        boolean isMarried= false;
        boolean result = 100 > 300 ;
        System.out.println("result = " + result);
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);

        String name= "Wooden spoon";
        String city = "Maras";
        String state = "Virginia";
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);



    }









}
