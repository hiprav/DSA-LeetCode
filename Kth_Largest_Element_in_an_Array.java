package com.leet_code;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println(findKthLargest(arr,3));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        return minHeap.peek();
    }
}
