package Loops;

public class Rev2 {
    public static void main(String[] args) {
        String str = " Mandaviya";
        String rev2 = "";

       int length = str.length();

       for( int x = length-1 ; x >= 0; x-- ){

           rev2 = rev2 + str.charAt(x);

       }
        System.out.println( rev2);
    }
}

