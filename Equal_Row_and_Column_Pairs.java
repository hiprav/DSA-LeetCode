package com.leet_code;

import java.util.Arrays;
import java.util.HashSet;

public class Equal_Row_and_Column_Pairs {
    public static void main(String[] args) {
        int[][] arr={{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(equalPairs(arr));
    }
    public static int equalPairs(int[][] grid) {
     int ans=0;
        int[][]c=new int[grid.length][grid.length];
        for (int i = 0; i < grid.length; i++) {int[] a=new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
               a[j]=grid[j][i];
            }
            c[i]=a;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
               if(help(grid[i],c[j])){
                   ans++;
               }
            }
        }
        return ans;
    }
    private static boolean help(int[] ints, int[] ints1) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]!=ints1[i]){
                return false;
            }
        }
        return true;
    }
}
