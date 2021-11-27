package Loops;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Reverse {
    public static void main(String[] args) {
        String str = "yash";

        String rev = "";  // blank reverse name will be show directly nothing more


        int length=str.length();  // i need to verify the first how much the word in the string


        for(int i=length-1;i>=0;i--)
            /* i create th loop it will be helped to the going back word direction (letter by letter)
            like 4  3  2  1  */
        {
        rev= rev+str.charAt(i); // i use char because i m going back with one-one letter
        }
        System.out.println("The reverse name is := " + rev);
    }
  }

