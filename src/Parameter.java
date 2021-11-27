public class Parameter {

    public static void mult(int a, int b){
        int A = a * b;

        System.out.println(A);

    }

    public static void main(String[] args) {
        mult(10,20);
        add(10,20);
        div(10.12f, (byte) 1);
        substrac(10,20);

    }
    public static void add(int c, int d){

    int C = c + d;
        System.out.println(C);

    }
    public static void div(float e , byte f){
        float  E = e/f;
        System.out.println(E);
    }
    public static void substrac(int g, int h){
        int G = g-h;
        System.out.println(G);
    }
}
