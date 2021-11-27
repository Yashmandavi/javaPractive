package Oops;
// main class
public class Constructor1 {

    int valueoffood;

    public Constructor1(int foodvalue){
        valueoffood = foodvalue;

    }

    public static void main(String[] args) {
        Constructor1 food = new Constructor1(32);
        System.out.println(" apple := " + food.valueoffood);
    }
}
