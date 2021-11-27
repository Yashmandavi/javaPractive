/*When you have a variable in child class which is already present
in the parent class then in order to access the variable of parent class,
you need to use the super keyword.
 */

package Oops;


// main == PARENT
    class Superclass {
    int num = 17655456;

}
// sub == CHILD
    class Subclass extends Superclass
    {

        int num = 187454;
        void printNumber(){
            System.out.println(num);
        }
        public static void main(String args[]){
            Subclass obj= new Subclass();
            obj.printNumber();
        }
    }

