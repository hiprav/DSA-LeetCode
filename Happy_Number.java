package com.leet_code;

public class Happy_Number {
    public static void main(String[] args) {// very confusing  // Google
        System.out.println(ishappy(19));
    }
    static public boolean ishappy(int n){
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (slow!=fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }
   static public int findSquare(int number){
        int ans = 0;
        while(number > 0){
            int res = number % 10;
            ans += res * res;
            number /= 10;
        }
        return ans;
    }
}
