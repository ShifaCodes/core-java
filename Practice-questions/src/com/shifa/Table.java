package com.shifa;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Multiplication Table Generator");
        System.out.print("Enter the number:");

        int number = scanner.nextInt();
        System.out.println("\nMultiplication Table for " + number + ":\n");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
        scanner.close();
    }
}
