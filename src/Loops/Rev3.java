package Loops;

public class Rev3 {
    public static void main(String[] args) {
        String str = " yashkumar khimjibhai mandaviya";

        String rev = "";

        int length = str.length();

                for ( int i = length - 1 ; i >= 0 ; i--)

                    {

                            rev = rev + str.charAt(i);

                    }


                            System.out.println(rev);

                                        }

}
