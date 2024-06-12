package leet_code;


import java.util.ArrayList;

public class find_dublicate {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
       // System.out.println(dublicate(arr));//<<-------single dublicate number
        System.out.println(dublicates(arr));//<<--------------multipal dublicate number

    }
    static ArrayList<Integer> dublicates(int[] arr){
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
                list.add(arr[k]);
            }
        }
        return list;
    }
    //---------------------------------------------------------------
         //   [3,4,2,1,2]
    static int dublicate(int[] arr){  // --- work for only one dublicate
        int i =0;
        while(i< arr.length){
            if (arr[i] != i+1) { // ---- this check is use to see for dublicate
                if (arr[i] != arr[arr[i]-1]) { // ----- this is use to see for cyclic sort
                    int temp=arr[arr[i]-1];
                    arr[arr[i]-1]=arr[i];
                    arr[i]=temp;
                }else {
                    return arr[i];
                }
            }else {
               i++;
            }
        }
        return -1;
    }
}
