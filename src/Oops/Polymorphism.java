package Oops;

class university {
        public void  detail(){
            System.out.println(" find the university detail");

        }
        public void area(int i){
            System.out.println("the  university area = " + 12* i * i   );

        }
        public  void  classroom(int small, int large){
            System.out.println("The small class room  is = "+ 17* small);
            System.out.println("The large class room is =  " + 16* large);
            System.out.println(" The total class room is  = " + ((17+16)+small+large));

        }

    }
    class main{
        public static void main(String[] args) {

            university essex = new university();
            essex.detail();
            essex.area(12);
            essex.classroom(23, 24);

        }



        }


