package Oops;

public class Student{
        String name;
        int rollNo;


        public Student(String name, int rollNo) {

            this.rollNo = rollNo;
            this.name = name;

        }
        void display(){
            System.out.println("Name: " +name + ", "+"Roll no: " +rollNo);

        }
        public static void main(String[] args)
        {

            Student st1 = new Student("Yash", 05);
            Student st2 = new Student("Divyesh", 02);

            st1.display();
            st2.display();
        }
    }


