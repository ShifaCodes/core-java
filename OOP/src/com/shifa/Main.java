package com.shifa;

public class Main {

    public static void main(String[] args) {
        //store % roll nos
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        //data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        //just declaring
      //  Student shifa;
      //  shifa = new Student();

        Student shifa = new Student();

       // shifa.rno = 19;
        //shifa.name = "shifa fatima";
        //shifa.marks = 97f;

        //shifa.changeName("Shoe lover")
      //  shifa.greeting();

      System.out.println(shifa.rno);
        System.out.println(shifa.name);
        System.out.println(shifa.marks);

        Student random = new Student(shifa);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something Something";

        System.out.println(two.name);


    }
}

    //create a class
//for every Single Student
    class Student {
        int rno;
        String name ;
        float marks = 90;
        
        //we need a way to add the values of the above
        // properties object by object
        
        //we need one word to access every object

        void greeting() {
            System.out.println("Hello! My name is " + this.name);
        }

        void changeName(String name) {
            this.name = name;
        }

        Student (Student other) {
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        Student () {
            //this is how u call  a constructor from another constuctor
            //internally: new student (13, "default person", 100.0f);
            this (13, "default person", 100.0f);

        }
 //Student arpit = new Student(17, "Arpit", 89.7f);
        //here, this will be replaced with arpit
        Student (int rno, String name, float marks) {

            this.rno = rno;
            this.name =  name;
            this.marks = marks;

        }
}
