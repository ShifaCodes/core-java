package com.shifa;

public class Main {

    public static void main(String[] args) {
	// Q. store a roll no
        int a = 19;

        // Q. Store a persons name
        String name = "Shifa Fatima";

        // Q. Store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        //Syntax
        //datatype[] variable_name = new datatype[size];
        //store 5 roll no
        //int[] rnos = new int [5];
        //or directly
       // int[] rnos2 = {23, 12, 45, 32, 15};
       int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; //initialisation: actually here object is being created in
        // the memory (heap)
        System.out.println(ros[1]);


    }
}




