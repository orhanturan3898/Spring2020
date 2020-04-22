package March2020.ZZZ_Replits;

import java.util.Scanner;

public class summmm {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms=0 ;
        int garageSpots=0;
        float metroAccessibility=0;
        float schoolScore=0;
        float highwayAccessibility=0;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        System.out.println("Enter your property type");
        String propertytype=scan.next();
        if (propertytype.equalsIgnoreCase("condo")) {
            int price=50000;
            System.out.println("How many bedrooms do you have?");
            numberOfBedrooms=scan.nextInt();
            price+=numberOfBedrooms*30000;
            System.out.println("Backyard not availbale");
            System.out.println("Do you have garage?");
            garage=scan.nextBoolean();
            if (garage){
                System.out.println("How many spots?");
                if (garageSpots>=10){
                    System.out.println("Pardon, it is not a public garage");

                }else {

                    price += garageSpots * 20000;
                }
                System.out.println("How close is metro station?");
                metroAccessibility=scan.nextInt();
                if (metroAccessibility<1){
                    price+=10000;
                } if (metroAccessibility>1 || metroAccessibility<3){
                    price+=5000;
                }
                System.out.println("How close is highway?");
                highwayAccessibility=scan.nextInt();
                if (highwayAccessibility<1){
                    price+=15000;
                }if (highwayAccessibility>1 || highwayAccessibility<5){
                    price+=8000;
                }



            }


        }
        if (propertytype.equalsIgnoreCase("townhouse")){
            int price=75000;
            System.out.println("How many bedrooms do you have?");
            numberOfBedrooms=scan.nextInt();
            price+=numberOfBedrooms*30000;
            System.out.println("Do you have a backyard");
            backyard=scan.nextBoolean();
            if (backyard){
                price+=5000;
            }
            System.out.println("How close is metro station?");
            metroAccessibility=scan.nextInt();
            if (metroAccessibility<1){
                price+=10000;
            } if (metroAccessibility>1 && metroAccessibility<3){
                price+=5000;
            }
            System.out.println("How close is highway?");
            highwayAccessibility=scan.nextInt();
            if (highwayAccessibility<1){
                price+=15000;
            }if (highwayAccessibility>1 && highwayAccessibility<5){
                price+=8000;
            }if (highwayAccessibility>5 && highwayAccessibility<20){
                price+=4000;
            }



        }
        if (propertytype.equalsIgnoreCase("single family house")){
            int price=95000;
            System.out.println("How many bedrooms do you have?");
            numberOfBedrooms=scan.nextInt();
            price+=numberOfBedrooms*30000;
            System.out.println("Do you have a backyard");
            backyard=scan.nextBoolean();
            if (backyard) {
                price += 5000;

            }
            System.out.println("How close is metro station?");
            metroAccessibility=scan.nextInt();
            if (metroAccessibility<1){
                price+=10000;
            } if (metroAccessibility>1 && metroAccessibility<3){
                price+=5000;
            }
            System.out.println("How close is highway?");
            highwayAccessibility=scan.nextInt();
            if (highwayAccessibility<1){
                price+=15000;
            }if (highwayAccessibility>1 && highwayAccessibility<5){
                price+=8000;
            }if (highwayAccessibility>5 && highwayAccessibility<20){
                price+=4000;
            }




        }











    }

}

