import java.sql.SQLOutput;

public class Typeofmethod {
    public static void main(String[] args) {
        int sum1 = 10 + 15;
        System.out.println(sum1);
        add(5,10);
        multi(10,20);
        Acm1 yash = new Acm1();
        int a = 15;
        System.out.println((yash.i)-a);
 // access modifier use Acm1 class
    }

    public static int add(int a, int b) {
        int sum1 = a+b;
        System.out.println(sum1);
        return a+b;


    }
    public static void multi(int a, int b){
        int c = a*b;
        System.out.println(c);
}




}
