package com.leet_code;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] arr) {
        int l=0,r= arr.length-1;
        int max=0;
        while (l<=r){
            if (arr[l] <= arr[r]) {
                max=Math.max(max,(Math.min(arr[l],arr[r]))*(r-l));
                l++;
            }else {
                max=Math.max(max,(Math.min(arr[l],arr[r]))*(r-l));
                r--;
            }
        }
        return max;
    }
}
