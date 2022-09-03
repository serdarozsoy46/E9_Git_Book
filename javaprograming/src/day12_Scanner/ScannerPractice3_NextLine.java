package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

      //123 Enter
        Scanner input = new Scanner(System.in); 

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your Programming Language : ");
        String programming = input.nextLine(); // Java Programming LanguageEnter

        System.out.println("Enter your age:");
        int age = input.nextInt(); // 24

        input.nextLine(); //

        System.out.println("Enter your scholl name");
        String schollName = input.nextLine(); // Enter

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age="+age);
        System.out.println("schollName = " + schollName);

      input.close();

    }




}
