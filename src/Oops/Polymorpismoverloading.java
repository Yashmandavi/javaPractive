package Oops;

class Apple {
    public void company(){
        System.out.println("The company name and price  = ");
    }
}
class asda extends Apple{
     public void price() {
         System.out.println(" The price of apple in asda is 1.5 pounds ");
     }
}

class aldi extends Apple {
    public void price() {
             System.out.println(" The price of apple in aldi is 1.2 pounds");
         }
}

class VB extends Apple{
    public void price(){
                 System.out.println(" The price of apple in VB is 2 pounds ");
             }
}

class main1{
    public static void main(String[] args) {
        Apple apple = new Apple();
        asda asda = new asda();
        aldi aldi = new aldi();
        VB vb = new VB();
    apple.company();
    asda.price();
    aldi.price();
    vb.price();

     }
}



