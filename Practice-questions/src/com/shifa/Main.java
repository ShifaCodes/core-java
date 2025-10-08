package com.shifa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Q.Take name as input and print a greeting message for
        // that particular name?

        String name;

        System.out.println("Please enter your Name:");

        name = scanner.next();
        System.out.println("Hello, " + name + "! Welcome to the simple Java program.");

        System.out.println("Nice to meet you.");
    }
}
