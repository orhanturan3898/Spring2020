package March2020.Day9_Nested_If_And_Ternary;

public class repllit {
    public static void main(String[] args) {
        /*
My friend has seen a gorgeous pair of shoes in Louis Vuitton. She will buy the shoes if they are less than $2000.
            if they are more than $1500 she will use credit card. if they are less than $ 1500 she will use debit.
            if LV has extra 20% off she will buy a scarf. If the shoes are more than $2000,
            she will buy from different brand.
 */
        int amount=1200;
        String purchase= " ";
        if (amount<2000){
            purchase=(amount>1500)? "credit":"debit";

        }else {
            purchase="NO";
        }
        System.out.println(purchase);
    }

}

