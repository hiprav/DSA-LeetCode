package leet_code;

import java.util.Arrays;

public class Special_Array {
    public static void main(String[] args) {
        int[] nums = {3,9,7,8,3,8,6,6};
        //System.out.println(specialArry(nums));//  BC question hi nahi samaj me aaya...
        specialArry(nums);
    }

    static int specialArray(int[] nums) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                count+=1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= min && nums[i] > 0) {
                min = nums[i];
            }
        }
        if (min >= count && count!=0) {
            return count;
        }
        System.out.println(count);
        System.out.println(min);
        return -1;
    }

//-____________________________-----------------------------------------------------------------
//     AI solution
    static int specialArry(int[] nums) {

        for (int x = 0; x <= 1001; x++) {   
            int count = 0; 
            for (int num : nums) {
                if (num >= x) {
                    count++;
                } 
            }
            if (count == x) {
                return x;
            }
        }
        return -1; 
    }
}
