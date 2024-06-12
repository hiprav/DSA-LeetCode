package com.leet_code;

import java.util.Arrays;

public class Height_Checker {
    public static void main(String[] args) {
        int[] arr={1,1,4,2,1,3};
        System.out.println(heightChecker(arr));
    }
    static int heightChecker(int[] heights){
        int[] arr = heights.clone();
        boolean swap ;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            swap=false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]  >arr[j]) {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if (!swap){break;}
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != heights[i]) {
                count+=1;
            }
        }

     return count;
    }
}
