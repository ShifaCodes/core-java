package com.shifa;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b =20;

        //swap numbers code
       // int temp = a;
        // a = b;
        // b = temp;

        //all this swaping will not execute
       swap(a, b);
       System.out.println(a + " " + b);
        String name = "Shifa Fatima";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "rahul";
    }

    static void swap(int a, int b) {
        int temp = a;
         a = b;
         b = temp;
    }
}
