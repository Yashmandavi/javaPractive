package Array;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String args[]){
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("yash");
        alist.add("divyesh");
        alist.add("jenish");
        alist.add("dharmesh");
        alist.add("nensi");
        alist.add("nirav");


        System.out.println(alist);

        //Adding "yash" at the fourth position
        alist.add(3, "yash");

        System.out.println(alist);
    }
}

