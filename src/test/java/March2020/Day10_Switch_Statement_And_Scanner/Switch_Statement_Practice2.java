package March2020.Day10_Switch_Statement_And_Scanner;

public class Switch_Statement_Practice2 {
    public static void main(String[] args) {
        int num = 0;
        switch (1) {
            case 1:
                num += 3;
                break;

            case 2:
                num += 2;

            case 3:
                num += 10;


            default:
                num -= 5;
                break;
        }
        System.out.println(num);
    }
}
