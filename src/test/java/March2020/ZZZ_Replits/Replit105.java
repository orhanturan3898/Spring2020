package March2020.ZZZ_Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Replit105 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        for (int i=0;i<5;i++){
            words[i]=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);




        }
        System.out.print(Arrays.toString(words));

    }
}
