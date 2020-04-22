package March2020.ZZZ_Replits;

public class Replit113 {
    public static void main(String[] args) {

        int[] numbers = new int[61];

        int count = 0;


        for (int i = 60; i >= 0; i--) {
           numbers[i]=i+1;



        }
        for (int each : numbers) {
            if (!(each % 2 == 0)) {
                continue;
            }
            System.out.print(each+ " ");
        }




    }
}
