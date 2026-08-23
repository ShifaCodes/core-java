package com.shifa;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = prod(55);
        //if we put any didgit that contains 0 then the answer will become 0 itself;
        System.out.println(ans);
    }
    static int prod(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n%10) * prod(n/10);
    }
}
