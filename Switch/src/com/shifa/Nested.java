package com.shifa;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Shifa Fatima");
                break;
            case 2:
                System.out.println("Seeta geeta");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("no department entered");
                }
            default:
                System.out.println("enter coorect EmpID");
        }
    }
}

