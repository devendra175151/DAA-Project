package com.example.devendra.linkedlist;
// https://practice.geeksforgeeks.org/problems/next-happy-number4538/1
public class HappyNumber {
    public static void main(String[] args) {
        int n = 13;
        boolean ans = find(n);
        System.out.println(ans);
    }
    static boolean find(int n){
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (fast != slow);
        if(slow == 1){
            return true;
        }else {
            return false;
        }
    }

    private static int findSquare(int n) {
        int ans = 0;
        while (n > 0){
            int rem = n % 10;
            ans = ans + rem * rem;
            n /= 10;
        }
        return ans;
    }
}
