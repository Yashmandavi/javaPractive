import java.sql.SQLOutput;

public class Arithmetic{
    static int b = 0;
    static int c = 1;

    public static class Intwergar{
      float f = 10.9f;

    }

    public static void main(String[] args) {

        int x,y,z,a;
        String words ="I Love India";
        x = 10;
        y = 20;
        z = 30;

        Intwergar abc = new Intwergar();
        System.out.println("the float values:"+abc.f);


        a = x + y + z;
        System.out.println("The sum  values of:"+a);

        // Seconds method of the sum

        System.out.println(x + y + z );

        // Multiplication method
        System.out.println("The multiplication of:"+x*y*z);

        //  Subtraction method
        System.out.println("The subtraction values of:"+(x-y-z));

        // Division method
        System.out.println("The division values of:" +(y/x));

        // Address and My name
        System.out.println("Fullname:- yashkumar khimjibhai mandaviya");
        System.out.println("Address:- 125 Belmont road");
        System.out.println("Harrow");
        System.out.println("Postcode:- HA3 7PL");

        // String  method
        System.out.println(words);

        // Static method in main method
        System.out.println(z+c+b);

    }
}

