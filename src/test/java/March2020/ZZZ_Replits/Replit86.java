package March2020.ZZZ_Replits;

public class Replit86 {
    public static void main(String[] args) {

        String word="";
        int countofcat=0;
        int countofdog=0;

        for (int i=0;i<=word.length()-1;i++){
            if (word.charAt(i)=='c' && word.charAt(i+1)=='a' && word.charAt(i+2)=='t'){
                countofcat++;
            }
        }

        for (int i=0;i<=word.length()-1;i++){
            if (word.charAt(i)=='d' && word.charAt(i+1)=='o' && word.charAt(i+2)=='g'){
                countofdog++;
            }
        }
        System.out.println(countofcat);
        System.out.println(countofdog);

        boolean result=countofcat==countofdog;

        System.out.println(result);



    }
}
