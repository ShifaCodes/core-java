package com.shifa;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // Q.Input a year and find whether it is a leap year or not?
        int year;
        System.out.println("Please enter a year:");
        year = scanner.nextInt();

        //    A year is a leap year if it is divisible by 4 BUT NOT by 100.

      if ((year % 4 == 0 && year % 100 != 0)) {
            // If the condition is true, it is a leap year.
            System.out.println(year + " is a leap year!");
        } else {
            // Otherwise, it is not a leap year.
            System.out.println(year + " is not a leap year.");
        }
    }
}


