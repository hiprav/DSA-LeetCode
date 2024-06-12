package com.leet_code;

import java.util.Stack;

public class Removing_Stars_From_a_String {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
        String result="";
        Stack<Character> st=new Stack<>();
        int count=0;
        for (int i = s.length()-1; i >=0; i--) {/* "leet**cod*e" */
            if(s.charAt(i)=='*'){
                count+=1;
            }else {
                if (count > 0) {
                    count--;
                }else {st.push(s.charAt(i));}
            }
        }
        while (!st.empty()){
            result+=st.pop();
        }
        return result;
    }
//    int l = s.length();//             without stack sloution which is way more faster
//    byte[] res = new byte[l];
//        s.getBytes(0,l,res,0);
//    int countStars = 0;
//        for(int i=0; i<l; i++){
//        if(res[i] == '*') countStars++;
//        else res[i-countStars*2] = res[i];
//    }
//        return new String(res,0,l-countStars*2);
}
