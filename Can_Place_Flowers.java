package com.leet_code;

public class Can_Place_Flowers {
    public static void main(String[] args) {
        int[] arr={0};
         int n=1;
        System.out.println(canPlaceFlowers(arr,n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length==1 && flowerbed[0]==0){
            return true;
        }
       else if (flowerbed[0] ==0 && flowerbed[1] ==0){
            flowerbed[0]=1;
            n--;
        }
       for (int i = 2; i < flowerbed.length; i++) {

            if (flowerbed[i-2] == 0 && flowerbed[i-1] == 0 && flowerbed[i-0] == 0){
                flowerbed[i-1]=1;
                n--;
            }
            if (flowerbed[flowerbed.length-2] ==0 && flowerbed[flowerbed.length-1] ==0 ){
                flowerbed[flowerbed.length-1]=1;
                n--;
            }
        }
        return n<=0 ? true: false;

//        int k=flowerbed.length;    best solution
//        for(int i=0;i<k;i=i+2){
//            if(flowerbed[i] == 0)
//                if(i==flowerbed.length-1 || flowerbed[i]==flowerbed[i+1]){
//                    n--;
//                }
//                else{
//                    i++;
//                }
//        }
//        return n<=0;
    }
}
