package com.shifa;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Use double to allow for decimal number inputs and long to handle potentially large sums
        double totalSum = 0.0;
        String input;

        System.out.println("--- Sum Calculator ---");
        System.out.println("Enter numbers one by one. Enter 'x' to calculate the sum and exit.");
        System.out.println("----------------------");

        // Start an infinite loop to keep taking input
        while (true) {
            System.out.print("Enter a number or 'x': ");

            // Read the entire line of input as a String
            input = scanner.nextLine();

            // Check for the exit condition (case-insensitive)
            if (input.equalsIgnoreCase("x")) {
                break; // Exit the while loop
            }

            // Attempt to parse the input as a double
            try {
                // Parse the string into a double number
                double number = Double.parseDouble(input);

                // Add the parsed number to the total sum
                totalSum += number;

                System.out.println("-> Added " + number + ". Current Sum: " + String.format("%.2f", totalSum));

            } catch (NumberFormatException e) {
                // This block executes if the input is not 'x' AND not a valid number
                System.out.println("Invalid input: Please enter a valid number or 'x' to exit.");
            }
        }

        // Print the final result after the user enters 'x'
        System.out.println("\n----------------------");
        System.out.println("Final sum of all numbers entered is: " + String.format("%.2f", totalSum));
        System.out.println("----------------------");

        scanner.close();
    }
}

