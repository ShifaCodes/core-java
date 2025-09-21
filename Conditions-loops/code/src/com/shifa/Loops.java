package com.shifa;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
          /*
            Syntax for loops :
            for(initialization; condition; increment/decrement) {
            //body
            }
           */
        // Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 1) {
//            System.out.println(num);
//        }
        // Print numbers from 1 to n
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

//
        // While loop
        /*
        Syntax :
            while (condition) {
            //body
            }
         */
        int num = 1;
        while (num <= 5) {
            //    System.out.println(num);
            num += 1;
        }
        // Do-While loop
        /*
            Syntax:
            do {
              //body
            } while(Condition);
         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
