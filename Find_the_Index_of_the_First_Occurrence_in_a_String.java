package com.leet_code;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            int count = needle.length();
            int e = i;
            for (int j = 0; j < needle.length() && e < haystack.length(); j++) {
                if (haystack.charAt(e) == needle.charAt(j)) {
                    count--;
                }
                e++;
            }
            if (count == 0) {
                return i;
            }
        }
        return -1;
    }
}
