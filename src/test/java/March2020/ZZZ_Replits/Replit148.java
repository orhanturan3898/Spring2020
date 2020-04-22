package March2020.ZZZ_Replits;



import java.util.Scanner;

public class Replit148 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        int num=scan.nextInt();
        next3(num);
    }

    public static void next3(int number){

        for (int i=0;i<3;i++){
            System.out.println(number+i+ " ");
        }

    }
}
