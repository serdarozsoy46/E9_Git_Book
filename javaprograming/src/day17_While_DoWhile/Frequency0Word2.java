package day17_While_DoWhile;

public class Frequency0Word2 {
    public static void main(String[] args) {
        String str = "Cat Cat Dog  cat caT";

        int frequency = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String eachSub = str.substring(i, i + 3);

            if (eachSub.equals("Cat")) {// Eger equalsIgnoreCase kulllanirsak  butun catleri sayar
                frequency++;
            }

            }

        System.out.println(frequency);
        }

    }