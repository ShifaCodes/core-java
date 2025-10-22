package com.shifa;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Function to find the HCF (GCD) using the Euclidean Algorithm
        public static int gcd ( int a, int b);
        {
            // The loop continues until b becomes 0
            while (b != 0) {
                int temp = b;
                b = a % b; // New remainder
                a = temp;  // New divisor
            }
            // When the loop finishes, 'a' holds the HCF
            return a;

        }
    }
}
