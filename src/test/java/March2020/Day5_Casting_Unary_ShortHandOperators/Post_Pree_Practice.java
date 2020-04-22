package March2020.Day5_Casting_Unary_ShortHandOperators;

public class Post_Pree_Practice {
    public static void main(String[] args) {
        int b = 1; //
        b = -b-- + b++ / -b-- * --b;
        //  -1  +  0  / -1    * -1;
        System.out.println(b);


    }
}
