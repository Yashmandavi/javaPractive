package Loops;

public class Forloop {
    public static void main(String[] args)
    {
        int i, j;


        for (i = 1; i <= 5; i++)   // first logic i = 1

            {

                for (j = 1; j <= i; j++)  // second logic thing is j=1 and 1 <= i (1)
            {

                System.out.println("*");
                // System.out.print("*");    // println here ln means new line when i remove this at that time i got this result

            }
           // System.out.print("\n");

        }
    }
}
