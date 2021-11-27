package Loops;

public class FIbonnaci {
    public static void main(String[] args) {
        int i = 1;
        int j = 10;
        int x = 0;
        int y = 1;


        for( i =1 ; i <= j ; ++i){
            System.out.print(x+ " , ");
            int series = x + y;
            x = y;
            y = series;

        }

    }
}
