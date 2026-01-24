package com.shifa;
// https:??leetcode.com?problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new col , take a new sum for that row
            int sum = 0;
            for (int account = 0; account < ints.length; account++) {
                sum += ints[account];
            }
            //now we have sum of account of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

