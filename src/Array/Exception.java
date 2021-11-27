package Array;

public class Exception {
    public static void main(String[] args) {
        try {
            String a[] = {"yash","divyesh","jenish" };
            System.out.println(" element 3: " + a[2]);
            System.out.println(" element 1: " +a[0]);
            System.out.println(" element 4: " + a[3]);

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Type of Exception" + e);


        }
    }
}
