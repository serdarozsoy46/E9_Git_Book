package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";//bdf

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);//'A'
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);//each character of str
                if(ch == each){
                    count++;
                }
            }

            if(count == 1){
                result += ch;
            }

        }

        System.out.println(result);






    }
}
