package March2020.ZZZ_Replits;

public class Replit164 {
    public static void main(String[] args) {

    }

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {

        if (isAvailable == true && year == 2018) {
            if (month==7 && day<=8 &&day>=1){
                return false;
            }else {
                return true;
            }


        }
        return false;


    }
}
