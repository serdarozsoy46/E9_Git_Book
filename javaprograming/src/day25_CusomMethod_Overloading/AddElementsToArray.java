package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        arr = addInteger(arr, 5);//12345
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addDouble(arr2, 5.5); //{1.5, 2.5, 3.5, 4.5, 5.5}

        System.out.println(Arrays.toString(arr2));

        System.out.println("--------------------------------------------------");

        String[] names = {"Tatiana", "Oleksandr", "Cassandra", "Ali"}; //"Neria"

        names = addString(names, "Neria");//{"Tatiana", "Oleksandr", "Cassandra", "Ali", "Neria"}

        names = addString(names,"Igor");

        System.out.println(Arrays.toString(names));

        System.out.println("--------------------------------------------------");

        char[] chars = {'A','B','C','D'};
        chars =  addChar(chars, 'E'); //{'A','B','C','D','E'}

        System.out.println(Arrays.toString(chars));
    }


    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

       result[i] = element;

        return result;
    }

    public static double[] addDouble(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array){
          result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String[] addString(String[] array, String element){
        String[] result = new  String[array.length + 1];

        int i = 0;
        for (String each : array){
            result[i++] = each;
        }
        result[result.length-1]=element;
        return result;
    }

    public static char[] addChar(char[] array, char element){
        char[] result = new  char[array.length + 1];

        int i = 0;
        for (char each : array){
            result[i++] = each;
        }
        result[result.length-1]=element;
        return result;
    }



}
