package com.leet_code;

import java.sql.SQLOutput;

public class Reverse_Vowels_of_a_String {
    public static void main(String[] args) {
        System.out.println(reverseVowels("racecar"));
    }
    public static String reverseVowels(String s) {// two pointer approch
        int n= s.length();
        char ch[] =s.toCharArray();
        int st=0;
        int en=s.length()-1;
        while (st<en){
            if (!isvoval(ch[st])) {
                st++;
            } else if (!isvoval(ch[en])) {
                en--;
            }else {
                char temp=ch[st];
                ch[st]=ch[en];
                ch[en]=temp;
                st++;
                en--;
            }
        }
        return String.valueOf(ch);
    }
    public static boolean isvoval(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
            return true;
        }
        return false;
    }
}
