package com.leet_code;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
int[] a[]={};
String[]s=new String[2];
        System.out.println(Arrays.toString(s));

    }
    public static int successfulPairs(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == 7) {
                return arr[mid]; // Found 7, return it
            } else if (arr[mid] < 7) {
                left = mid + 1; // 7 or greater value is in the right half
            } else {
                result = arr[mid]; // Potential candidate for first value greater than 7
                right = mid - 1; // Continue searching in the left half for a smaller value
            }
        }

        return result; //
    }
}
