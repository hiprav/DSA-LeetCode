package leet_code;

import java.util.Arrays;

public class fair_candy_swap {
    public static void main(String[] args) {
     int[] aliceSizes = {1,1};
     int[] bobSizes = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
    }
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aum = 0;
        boolean[] inAlice = new boolean[100001];
        for (int i = 0; i < aliceSizes.length; i++) {
            aum += aliceSizes[i];
            inAlice[aliceSizes[i]] = true;
        }
        int bum = 0;
        for (int i = 0; i < bobSizes.length; i++) {
            bum += bobSizes[i];
        }
        int diff = aum - bum;
        int[] ans = new int[2];
        for (int i = 0; i < bobSizes.length; i++) {    /// ---------------------BC bhot complex hai
            int target = bobSizes[i] + diff / 2;
            if (target > 0 && target < 100001) {
                if (inAlice[target]) {
                    ans = new int[] {target, bobSizes[i]};
                    return ans;
                }
            }
        }
        return ans;
    }
}
