package day16_ForLoopStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {
        
        String str = "aabbaacc";
        
        String result = "";//abc
        //i <=7 ====> i<8
        
        for(int i = 0;i<= str.length()-1; i++ ){//i: represents the all the index numbers of str (stars from 0)
            String ch ="" + str.charAt(i); //represents each Character of str

            if( !result.contains(ch)){

            result += ch;
            }
            
        }
        System.out.println(result);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
