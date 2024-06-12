package leet_code;


import java.util.Arrays;

//Two Sum II - Input Array Is Sorted
public interface Two_Sum_II {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=12;
        System.out.println(Arrays.toString(two_sum(arr,target)));
    }
    static int[] two_sum(int[] arr, int target){
        int left=0;
        int right= arr.length-1;
         while (left<right){
             if (target==arr[left]+arr[right]) {
                 return new int[]{left+1,right+1};
             }else if (target <arr[left]+arr[right]) {
                 right--;
             } else {
                 left++;
             }
         }
        return new int[]{left+1,right+1};
    }
}
