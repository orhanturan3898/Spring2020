package March2020;


public class Self {
    public static void main(String[] args) {

        String str = "AABBCCCD";
        String result = removeDublicate(str);
        System.out.println(result);

        String str2 = "I like Java, Java is cool";
        String result2 = removeDublicateArray(str2);
        System.out.println(result2);

        String str3 = "A";
        int result3 = frequency(str, str3);
        System.out.println(result3);


        String name = "orhano";
        String result4 = unique(name);
        System.out.println(result4);


    }

    public static String removeDublicate(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!(result.contains("" + str.charAt(i)))) {
                result += str.charAt(i) + "";
            }

        }


        return result;


    }

    public static String removeDublicateArray(String str) {

        String[] words = str.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {

            if (!(result.contains("" + words[i]))) {
                result += words[i] + " ";
            }


        }


        return result;
    }

    public static int frequency(String str1, String str2) {
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.contains(str2)) {
                count++;
                str1 = str1.replaceFirst(str2, " ");
            }

        }


        return count;


    }

     public static String unique(String str) {
        String result = "";


        for (int j = 0; j <= str.length() - 1; j++) {
            int count = 0;


            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (count == 1) {
                result += str.charAt(j);
            }
        }


        return result;

    }


}