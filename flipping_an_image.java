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
    static int[][] flip2(int[][] image){
        for (int i = 0; i < image.length; i++) {
            int j = 0;
            int k = image.length - 1;
            while (j < k) {
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                j++;
                k--;
            }
        }
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[0].length; j++) {
                if(image[i][j] == 0){
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
