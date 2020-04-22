package March2020.ZZZ_Replits;

public class Replit97 {
    public static void main(String[] args) {

        String sentence = "";
        int countofjava = 0;
        int countofpython = 0;

        for (int i = 0; i <= sentence.length() - 1; i++) {
            if (sentence.charAt(i) == 'j' && sentence.charAt(i + 1) == 'a' && sentence.charAt(i + 2) == 'v' && sentence.charAt(i + 3) == 'a') {
                countofjava++;
            }
        }

        for (int i = 0; i <= sentence.length() - 1; i++) {
            if (sentence.charAt(i) == 'p' &&
                    sentence.charAt(i + 1) == 'y' &&
                    sentence.charAt(i + 2) == 't' &&
                    sentence.charAt(i + 3) == 'h' &&
                    sentence.charAt(i + 4) == 'o' &&
                    sentence.charAt(i + 5) == 'n') {
                countofpython++;
            }
        }
        boolean result = countofjava == countofpython;

        System.out.println(result);


    }
}
