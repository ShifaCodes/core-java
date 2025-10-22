package com.shifa;

public class Shadowing {
    static int x = 90;// this will be shadowed  at line 8
    public static void main(String[] args) {
        System.out.println(x);// print 90
        int x;// the class variable in line 4 is shadowed by this
        // System.out.println(x); // scope will begin when the value is initialised
        x = 40;
        System.out.println(x);// print 40
        fun();
    }
    static void fun() {
        System.out.println(x);
    };
}
