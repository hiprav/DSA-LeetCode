package leet_code;


import java.util.Arrays;

public class l1 {
    public static void main(String[] args) {
        int[] arr={5,0,1,2,3,4};
        System.out.println(Arrays.toString(permutation(arr)));
    }
    static int[] permutation(int[] arr){
        int[] ans =new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i]=arr[arr[i]];
        }
        return ans;
    }
}

