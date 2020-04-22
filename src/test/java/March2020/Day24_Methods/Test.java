package March2020.Day24_Methods;

import java.util.Arrays;

import March2020.Resources.Library;


public class Test {
    /*
    static:can be called through class name
     */
    public static void main(String[] args) {
        String str="Cybertek";
       String RevStr= Library.Reverse(str);
        System.out.println(RevStr);

        System.out.println(str.equalsIgnoreCase(RevStr));

        int[] arr={10000,3000,4000,5000,234};

        arr= Library.sortDesending(arr);
        System.out.println(Arrays.toString(arr));


    }
}
