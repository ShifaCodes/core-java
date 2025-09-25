package com.shifa;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;
         // lets assume p=a and i=b
        while (count <= n) {
            int temp =i;
            i = i + p;
            p =temp;
            count++;

            p= temp;
        }
        System.out.println(i);
    }
}
