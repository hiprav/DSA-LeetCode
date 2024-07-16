package com.leet_code;

public class Main {
    public static void main(String[] args) {
//        Rotate_List a=new Rotate_List();
//        a.insertfirst(5);
//        a.insertfirst(4);
//        a.insertfirst(3);
//        a.insertfirst(2);
//        a.insertfirst(1);
//        a.rotateRight(a.head,1);
//        a.display();
        int[] a={1,2,3,4,5,9};
        System.out.println(successfulPairs(a));

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
