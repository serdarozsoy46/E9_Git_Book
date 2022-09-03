package day10_NestedIf;

public class IfStatementsWithoutCurlyBraces {
    public static void main(String[] args) {

     int s =500;
     /*

     if(s>= 0 && s <= 100){

         if(s>=60){
             System.out.println("Passed");
         }

        }else{
            System.out.println("Invalid Score");
        }

      */
       String result = (s>= 0 && s <= 100)? (s>=60)? "Passed" :"Failed" : "Invalid Score";

        System.out.println(result);








    }
}
