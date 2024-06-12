package com.leet_code;

import java.util.Arrays;

public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String a="a good   example";
        System.out.println(reverseWords(a));
    }
    public static String reverseWords(String s) {// faster then 27% (-_-)
        s=s.trim();
        String x="";
        String[] str=new String[1];
        str = s.split(" ");
        int count=0;
        while (count < str.length/2){
            String temp=str[count];
            str[count]=str[str.length-count-1];
            str[str.length-count-1]=temp;
            count++;
        }
        for (int i = 0; i < str.length; i++) {
            if (! (str[i] =="") && i!=str.length-1){
                x=x+str[i]+" ";
            }else {x=x+str[i];}
        }
        return x;
    }
}
