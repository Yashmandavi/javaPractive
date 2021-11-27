public class Acm1 {
     int i = 12;
private  byte Y = 2;
protected float d = 4;
    private String yashkumar;

    public static void main(String[] args) {
        float b = 10.2f;
        int c =  22;

        Acm1 yash = new Acm1();
        System.out.println((yash.i)+b);
        System.out.println((yash.Y)*c);
        yash.name("mandaviya");
        System.out.println((yash.d)-b);
    }

    void name(String yashkumar){
        this.yashkumar = yashkumar;
    System.out.println(this.yashkumar);
}

}
