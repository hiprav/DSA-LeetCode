package com.leet_code;

public class first_missing_positive {
    public static void main(String[] args) {
       int[] arr={3,4,-1,1};
        System.out.println(FMP(arr));
    }
    static int FMP(int[]arr) {
        int i=0;
        while (i < arr.length){
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[arr[i]-1]) {
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!= j+1){
                return j+1;
            }
        }
        return arr.length;
    }
}

