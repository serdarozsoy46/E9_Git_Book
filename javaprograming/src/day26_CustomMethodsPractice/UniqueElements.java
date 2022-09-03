package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,4,5,5,6,7,7,7};

        int[] unique = UniqueElements(array);

        System.out.println(Arrays.toString(unique));

       double[] array2 = {1.5,1.5,2.5,3.5,4.5,5.5,};

       double[] unique2 = UniqueElements(array2);

        System.out.println(Arrays.toString(unique2));

    }

    public static int[] UniqueElements(int[] array){
        int[] result = {}; //new int[0]

        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array,each)  == 1){
             result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }

    public static double[] UniqueElements(double[] array){
        double[] result = {}; //new int[0]

        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array,each)  == 1){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }

    public static char[] UniqueElements(char[] array){
        char[] result = {}; //new int[0]

        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array,each)  == 1){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }

    public static String[] UniqueElements(String[] array){
        String[] result = {}; //new int[0]

        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array,each)  == 1){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


}
