package March2020.Day13_String_Class_Manipulation;

import java.util.Scanner;

public class Summary3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullname=scan.nextLine();

        String firstname=fullname.substring(0, fullname.indexOf(" "));
        firstname=firstname.substring(0,1).toUpperCase() +firstname.substring(1).toLowerCase();


        String lastname=fullname.substring(fullname.indexOf(" ")+1);
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();
        System.out.println("Your first name is: "+firstname);
        System.out.println("Your last name is:"+lastname);

    }
}
