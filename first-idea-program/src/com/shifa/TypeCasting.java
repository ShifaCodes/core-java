package com.shifa;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//          int num =input.nextInt();
//        System.out.println(num);

        //Typecasting
//       int num = (int)(67.86f);
//        System.out.println(num);
//
        //automatic type conversaion
//        int a = 257;
//        byte b = (byte)(a);
//      byte a = 40;
//      byte b = 50;
//      byte c = 100;
//      int d = (a * b) / c;
//        System.out.println(d);

        //(to handle this kind of problem java automatically promoting each byte
        //to integer when its evaluating this expression)
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.68f;
        double d = 0.1234;
        double result =(f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c)+ " " +(d - s));
        System.out.println(result);
    }
}
