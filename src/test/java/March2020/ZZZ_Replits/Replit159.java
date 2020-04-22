package March2020.ZZZ_Replits;

public class Replit159 {
    public static void main(String[] args) {
       String comeoon=c_profit(200,500);
        System.out.println(comeoon);

    }
    public static String c_profit(int buyprice,int sellprice){

        String result="";
        if (buyprice>sellprice){
            result="loss";
        }else if (sellprice>buyprice){
            result="profit";
        }else {
            result="no loss";
        }
        return result;



    }
}
