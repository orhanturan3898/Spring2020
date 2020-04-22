package March2020.ZZZ_Replits;

public class Replit156 {
    public static void main(String[] args) {
        String[] name={"a","foo","bar","foo","bla"};
        String a="foo";
        int result=count_apperance(name,a);
        System.out.println(result);



    }

    public static int count_apperance(String[] arr, String t) {

        int count = 0;


        //
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains(t)) {
                count++;
               // arr[i]=arr[i].replaceFirst(t," ");
            }


        }


        return count;


    }
}
