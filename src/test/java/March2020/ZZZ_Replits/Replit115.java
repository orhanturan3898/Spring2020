package March2020.ZZZ_Replits;

import java.util.Scanner;

public class Replit115 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();

        }


        int maxword = words[0].length();
        String maxwordssss = "";

        for (int i = 0; i < 5; i++) {
            if (words[i].length() > maxword) {
                maxwordssss = words[i];
            }
        }
        System.out.println(maxwordssss);


    }
}
