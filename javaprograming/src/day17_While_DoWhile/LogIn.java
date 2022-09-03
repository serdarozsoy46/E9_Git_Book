package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn{

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your username");
        String u=scan.next();

        System.out.println("Enter your passpord");
        String p = scan.next();

        if(u.equals("Cydeo")   && p.equals("Cydeo123")){

            System.out.println("Logged in");
        }else{
            int attempts = 3;
            while ( !(u.equals("Cydeo") && p.equals("Cydeo123"))  && attempts > 0){//while the credentials are invalid,
               if(attempts == 1){
                   System.out.println("THIS IS YOUR LAST CHANCE");
               }
                System.out.println("Incorrect username or passpord, please re-enter");
                System.out.println("Enter your usename");
                u= scan.next();

                System.out.println("Enter your passpord");
                p=scan.next();
                attempts--;
            }

            if(u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked.");

            }
        }
         scan.close();
        //username: "Cydeo"
        //password: "Cydeo123"

        //
        //while(invalid && hasAttempts)

    }
}
