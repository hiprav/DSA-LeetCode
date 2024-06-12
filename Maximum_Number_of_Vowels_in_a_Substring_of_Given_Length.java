package com.leet_code;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public static void main(String[] args) {
        String a="aeiou";
        System.out.println(maxVowels(a,2));
    }
    public static int maxVowels(String s, int k) {
        int st=0;
        int en=0;
        int total=0;
        int count=0;
        while (st<s.length()) {
            if (s.charAt(st) == 'a'||s.charAt(st) == 'e'||s.charAt(st) == 'i'||s.charAt(st) == 'o'||s.charAt(st) == 'u') {
                total++;
            }
            if (st-en+1 == k) {
                count=Math.max(count,total);
                if (s.charAt(en) == 'a'||s.charAt(en) == 'e'||s.charAt(en) == 'i'||s.charAt(en) == 'o'||s.charAt(en) == 'u') {
                    total--;
                }
                en++;
            }
            st++;
        }
        return count;
    }
}
