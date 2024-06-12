package leet_code;


import java.sql.Statement;
import java.util.Arrays;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,3,2,1};
        int n= arr.length/2;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr=new int[n*2];
        for(int i=0; i<n;i++){
            arr[i*2]=nums[i];
            arr[(i*2)+1]=nums[n+i];
        }
        return arr;
    }
}
