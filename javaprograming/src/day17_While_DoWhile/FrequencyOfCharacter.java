package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAABBBC";

        char ch = 'A';

        int frequency = 0;//+1+1+===3

        for (int i = 0; i<str.length() ; i++){//i: indexes of str
            char eachChar = str.charAt(i);//eachChar: each chacacter of str


            // 'A' == 'A' == 1 diye sayar
            if(ch == eachChar){// if given ch is matching with the eachChar, than ch is appeared in the string
                frequency++;// frequency += 1 anlamli ayni

            }

        }
        System.out.println(frequency);









    }
}
