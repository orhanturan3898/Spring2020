package March2020.ZZZ_Replits;

public class Replit99 {
    public static void main(String[] args) {

        String str="abcXXXabc";
        int count=0;

        for (int i=0;i<=str.length()-2;i++){

            if (str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)){
                count++;

            }



        }
        System.out.println(count);



    }
}
