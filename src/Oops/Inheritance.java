package Oops;

    class Animal{

            public static void animal(){
                System.out.println("The animal family ");
            }
        }

    class lion extends Animal {
            public void family1()
            {
                System.out.println(" prince ");
            }
        }

        class Bebylion extends Animal {
            public void family2() {
                System.out.println(" king");
            }

    }
    class main2{
        public static void main(String[] args) {
            Animal animal1 = new Animal();
            lion Lion = new lion();
            Bebylion bebylion = new Bebylion();



            Lion.animal();
            Lion.family1();
        }
    }
