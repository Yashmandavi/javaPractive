package Loops;

public class Rvtriangle {
    public static void main(String[] args) {

        for (int i = 4; i >= 1; i--) {

            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }

            for (int c = i; c >= 1; c--){

                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

