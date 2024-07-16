package com.leet_code;

public class Find_the_Highest_Altitude {
    public static void main(String[] args) {
        int[] arr={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int max=gain[0];
        int sum=gain[0];
        for (int i = 1; i < gain.length; i++) {

            max += gain[i];
            sum=Math.max(max,sum);
        }
        if (sum>0){
            return sum;
        }
        return 0;
    }
}
