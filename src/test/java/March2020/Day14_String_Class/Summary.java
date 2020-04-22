package March2020.Day14_String_Class;

import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter item name");
        String item = scan.nextLine();
        double Smartphone = 300.00;
        double Laptop = 400.00;
        double Charger = 15.00;
        double USBcable = 10.00;
        double Headphones = 30.00;
        double Pants = 50.00;
        double Hat = 25.00;
        double Socks = 5.00;
        double Blanket = 60.00;
        double Pillow = 40.00;

        if (item.contains("Smartphone")
                || item.contains("Laptop")
                || item.contains("Charger")
                || item.contains("USB cable")
                || item.contains("Headphones")
                || item.contains("Pants")
                || item.contains("Hat")
                || item.contains("Socks")
                || item.contains("Blanket")
                || item.contains("Pillow")) {
            if (item.equals("Smartphone")) {
                System.out.println(item);
                System.out.println("Thank you for your purchase");
                System.out.println("Sorry, not enough funds on your gift card!");
            }else if (item.equals("Laptop")){
                System.out.println(item);
                System.out.println("Thank you for your purchase");
                System.out.println("Sorry, not enough funds on your gift card!");
            }else if (item.equals("Charger")){
                System.out.println(item);
                System.out.println("Thank you for your purchase");
                System.out.println(100-Charger);
            }else if (item.equals("USB cable")){
                System.out.println(item);
                System.out.println("Thank you for your purchase");
                System.out.println(100-USBcable);
            }else if (item.equals("Headphones")){
                System.out.println(item);
                System.out.println("Thank you for your purchase");
                System.out.println(100-Headphones);
            }else if(item.equals("Pants")){
                System.out.println(item);
                System.out.println("Thank you for your purchase");
                System.out.println(100-Pants);
            }else if (item.equals("Hat")){
                System.out.println(item);
                System.out.println("Thank you for your purchase");
                System.out.println(100-Hat);
            }else if (item.equals("Socks")){
                System.out.println(item);
                System.out.println("Thank you for your purchase");
                System.out.println(100-Socks);
            }else if (item.equals("Blanket")){
                System.out.println(item);
                System.out.println("Thank you for your purchase");
                System.out.println(100-Blanket);
            }else {
                System.out.println(item);
                System.out.println("Thank you for your purchase");
                System.out.println(100-Pillow);
            }

            }else {
                System.out.println("Invalid item");
            }


        }
    }
