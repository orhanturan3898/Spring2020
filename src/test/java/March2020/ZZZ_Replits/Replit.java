package March2020.ZZZ_Replits;

public class Replit {
    public static void main(String[] args) {
        String str = "What's the difference between java, javascript and python?";

        int countofjava = 1;
        int countofpython = 1;

        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'j' && str.charAt(i + 1) != 'a' && str.charAt(i + 2) != 'v' && str.charAt(i + 3) != 'a') {
                countofjava++;
            }
            if (str.charAt(i) == 'p' && str.charAt(i + 1) != 'y' && str.charAt(i + 2) != 't' && str.charAt(i + 3) != 'h' && str.charAt(i + 4) != 'o' && str.charAt(i + 5) != 'n') {
                countofpython++;

            }


        }
        System.out.println(countofjava);
        System.out.println(countofpython);

        boolean result=countofjava==countofpython;
        System.out.println(result);


    }


}

