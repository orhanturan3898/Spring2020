package March2020.ZZZ_Replits;

public class Replit166 {

    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "abcde";

        String result = "";

        for (int j = 0; j < str2.length(); j++) {
            char ch1 = str2.charAt(j);  //1


            for (int i = 0; i < str1.length(); i++) {  //a
                char ch2 = str2.charAt(i);
                result += "" + ch1 + ch2;
            }

        }
        System.out.println(result);


    }


}
