package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("args = " + args);

        System.out.println("\n--------------Push up started--------------");


        for (int i = 1; i <=30 ; i++) {

            System.out.print("\rPush up "+i);// \r show in one line
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n--------------Push ups completed--------------");// \n down

        System.out.println("\n--------------Pull up started--------------");

        for (int i = 1; i <=20 ; i++) {

            System.out.print("\rPull up "+i);// \r show in one line
            sleep(2.5);
        }
        System.out.println("\n -------------Pull ups completed-----------");
    }
     //                        2.5
     public static void sleep(double second){

         try {
             Thread.sleep((long)(second * 1000));
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }



}
