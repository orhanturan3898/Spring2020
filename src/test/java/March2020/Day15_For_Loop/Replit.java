package March2020.Day15_For_Loop;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);

      double total=0;




        System.out.println("Select screen size:");
        String screensize=scan.next();
        switch (screensize){
            case ("13.3"):
                total+=200;
                break;
            case ("15.0"):
                total+=300;
                break;
            case ("17.3"):
                total+=400;
                break;
            default:
                System.out.println("invalid entry");

        }
        System.out.println("Select CPU type:");
        String cputype=scan.next();

        switch (cputype){
            case ("i3"):
                total+=150;
                break;
            case ("i5"):
                total+=250;
                break;
            case ("i7"):
                total+=350;
                break;
            default:
                System.out.println("Invalid entry");
        }
        System.out.println("Select RAM size:");

        int ramsize=scan.nextInt();
        total+=ramsize*50;

        System.out.println("Select storage type:");
        String storagetype=scan.next();
        switch (storagetype) {
            case ("SSD"):
                storagetype = "SSD";
                break;
            case ("HDD"):
                storagetype = "HDD";
                break;
            default:
                System.out.println("Invalid entry");

            }
        System.out.println("Enter memory size:");
        int memorysize=scan.nextInt();
        if (storagetype.equalsIgnoreCase("SSD")){

            total+=memorysize*100;
        }else{
            total+=memorysize*50;
        }
            System.out.println("Enter screen resolution:");

        String screenresolution=scan.next();

        switch (screenresolution){
            case("FULLHD"):
                total+=100;
                break;
            case("4K"):
                total+=200;
            default:
                System.out.println("Invalid");
        }
        System.out.println(total);








        }









    }

