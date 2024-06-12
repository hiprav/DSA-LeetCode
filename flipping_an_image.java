package leet_code;


import java.util.Arrays;

public class flipping_an_image {
    public static void main(String[] args) {
        int[][]arr={{1,1,0},{1,0,1},{0,0,0}};
        flip(arr);
        for (int[] row : arr){
            System.out.print(Arrays.toString(row));
        }
    }
    static void flip(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < (arr[i].length+2)/2; j++) {;       //    my logic is working but +2 nahi samja
                int temp=arr[i][j]^1;
                arr[i][j]=arr[i][arr[i].length-1-j]^1;
                arr[i][arr[i].length-1-j]=temp;
            }
        }
    }
    static int[][] flip2(int[][] arr){
        for(int[] row : arr){
            for (int i = 0; i < (arr[0].length+2)/2; i++) {//    this is kunals algo
                int temp=row[i]^1;
                row[i]=row[arr[0].length-1-i]^1;
                row[arr[0].length-1-i]=temp;
            }
        }
        return arr;
    }
}
