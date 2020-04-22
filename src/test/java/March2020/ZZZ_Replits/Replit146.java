package March2020.ZZZ_Replits;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Replit146 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        person(s);

    }
    public static void person(String info){

        String[] arr= info.split(",");

        System.out.println("person name: "+arr[0]+" last name: "+arr[1]+" age: "+arr[2]);




    }
}
