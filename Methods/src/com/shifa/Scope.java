package com.shifa;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Shifa";

        {
            // Here the block begins

         // int a = 78;//already initialised outside the block in the same
           a = 100;// reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Rahul";
            System.out.println(name);
            //value initialised in this block , will remain in block

        }
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c);// cannot use outside the block

        //Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
       // System.out.println(i);
    }
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
