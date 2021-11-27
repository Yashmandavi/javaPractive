package Loops;
// trying to do 1 0 1 0 1 0 print
// i=2; y=
public class Forloop2
{
    public static void Calculationtable(int no)

    {

        int i;

        for(i=1; i <= 10; i++)
        {

            System.out.println(no+ "*"+i+ "="+no*i );
        }

    }

    public static void main(String[] args)
    {
        Calculationtable(17);

        Calculationtable(20);

    }

    public static class loop
    {
        // 0 2 4 6 8 10
        public static void main(String[] args)
        {
            int x;
            for(x=0;x<=10;x++)
            {
                if( x%2 == 0)
                {
                    System.out.println(x);

                }
                else
                {
                    System.out.println();
                }
            }
        }
    }
}
