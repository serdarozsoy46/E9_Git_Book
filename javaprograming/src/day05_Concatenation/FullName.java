package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Serdar";
        String lastName = "Ozsoy";
        int age = 18;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        //Full name of the person is____
        String fullName = firstName + " " + lastName;
        //___ is __ years old
        System.out.println("Full name of the person is " + fullName );
        System.out.println(fullName + " is " + 18 + " years old" );
        //FullName is JobTitle, works at CompanyName, and FullName' salary is Salary
        System.out.println(fullName +" is " + jobTitle + ", works at " + companyName +", and "+fullName +"'s salary is $"+salary );


























    }










}
