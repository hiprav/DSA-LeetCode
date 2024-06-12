package com.leet_code;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] arr={4,2,1,1,2};
        //[true,false,false,false,false]
        int x=1;
        System.out.println(kidsWithCandies(arr,x));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> list=new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            if (max<=candies[i]){
                max=candies[i];
            }
        }
        for (int j = 0; j < candies.length; j++) {
            if (max>candies[j]+extraCandies){
                list.add(false);
            }else {
                list.add(true);
            }
        }
        return list;
    }
}
