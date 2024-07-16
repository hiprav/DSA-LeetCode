package com.leet_code;

public class Koko_Eating_Bananas {
    public static void main(String[] args) {
        int[] arr={1000000000};
        System.out.println(minEatingSpeed(arr,2));
        System.out.println();
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = 0;
        for (int i = 0; i < piles.length; i++) {
            e = Math.max(e, piles[i]);
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int sum = 0;
            for (int i = 0; i < piles.length; i++) {
                sum += (int)Math.ceil((float)piles[i]/mid);
            }
            if (h < sum) {
                s = mid + 1;
            } else {
                e = mid -1;
            }
        }
        return e;
    }
}
