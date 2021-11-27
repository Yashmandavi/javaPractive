package Oops;
// create the main class
public class Constructor {

    int idnumber;
    String fullname;



    // create a class constructor for the main class
    public Constructor( int number, String name){
  // set the initiate the value
        idnumber = number;
        fullname = name;

    }

    public static void main(String[] args) {

        // create a object for mai class
        Constructor developer = new Constructor(7101997,"yashkumar mandaviya");


        // print th e value
        System.out.println(developer.idnumber + "  :=  " +    developer.fullname);
    }

}
