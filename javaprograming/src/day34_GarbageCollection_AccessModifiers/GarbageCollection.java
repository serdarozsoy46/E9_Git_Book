package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

     /* // int n = null;only primiter
      String str = null;

        System.out.println(str.toUpperCase());

        */

        String str = "Woden Spoon";  // after line 16 , wooden spoon will be eligible for garbage collaction

        str = null;

        System.out.println(str);// woden spoon out  if we use str = null  its return null

        Car car1 = new Car("Toyota");
         car1 = null;

        System.out.println(car1);

        System.out.println("----------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);// its print max

        String lanquage = "Python";
        lanquage = "Java";

        System.out.println(lanquage);// java

        System.out.println("-----------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);// 100
        System.out.println(list2);// 100

        System.out.println(list1 == list2);

        System.out.println("--------------------------------------------");

        Student student1 = new Student("Tahir",30,'M','B',14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmed";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("--------------------------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = new ArrayList<>();// if =l1=l2  l1 java l2 java is out
        l2.add("Python");                        // if l1=l2 l1,l2 =java python
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
    }
}
