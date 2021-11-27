package Loops;

public class Forloop4 {
    public static void main(String[] args) {

        // even number

         int i ;
        /* for(i = 2 ; i <= 100; i += 2 ){
            System.out.println("" + i );
        }*/

        // odd number
        for(i = 99 ; i >= 1; i -= 2){
            System.out.println("" + i);
        }
    }

    public static class Ifelse {
        /* 0-20 child
        21-50 healthy man
        51-75 retired man
         */

        public static void agelimit(int x){
            if(x<=20)
            {
            System.out.println("The person is child" + x);
            }
            else if(x<20 && x>=50)
            {
                System.out.println("The person is healthy man" + x);
            }
              else if(x<50 && x>=75)
            {
                System.out.println("The person is retired man");
            }
        else
                System.out.println();
        }


        public static void main(String[] args) {
        agelimit(100);
        }

        }
}
