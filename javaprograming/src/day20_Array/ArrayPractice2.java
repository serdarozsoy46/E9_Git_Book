package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        char[] letters = new char [26];

        /*for (char i = 'A', j=0 ; i <= 'Z'&& j< letters.length ; i++, j++ ) {
            letters[j] = i;
        }


        System.out.println(Arrays.toString(letters));//[A~Z]*/

         char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }

        System.out.println(Arrays.toString(letters));

        System.out.println("-------------------------------------------------------");
        char[] letters2 = new char[26]; // [Z~A]






    }
}
