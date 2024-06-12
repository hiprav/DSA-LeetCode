package leet_code;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class finding_all_missing_number {   // ------- fro this sum learn about array list from kunal's "intro to array and array list timeStam-1:10"
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(allMissing(arr));
    }
    static ArrayList<Integer> allMissing(int[] arr){

        int i =0;
        ArrayList<Integer> list =new ArrayList<>(10);
        while(i< arr.length){
            if (arr[i] != arr[arr[i]-1]) {
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
            else {
                i++;
            }
        }
        for (int k = 0; k < arr.length; k++) {

            if (arr[k] != k+1) {
                list.add(k+1);
            }
        }
        return list;
    }
}
