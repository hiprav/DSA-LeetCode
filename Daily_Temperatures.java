package com.leet_code;

import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperatures {
    public static void main(String[] args) {
        int[] arr={30,60,90};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length==1){
            return new int[]{0};
        }
        int[] arr=new int[temperatures.length];
        arr[temperatures.length-1]=0;
        Stack<Integer> st=new Stack<>();
        st.push(temperatures.length-1);
        for (int i = temperatures.length-2; i >=0 ; i--) {
            while(!st.empty()&&temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if (!st.empty()) {
                arr[i]=st.peek()-i;
            }
            st.push(i);
        }
        return arr;
    }
}
