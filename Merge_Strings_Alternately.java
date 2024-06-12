package com.leet_code;

public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder();
        String w1="word11";
        String w2="word2";
        System.out.println(mergeAlternately(w1,w2));

    }
    public static String mergeAlternately(String word1, String word2) {//charAt(),concat(),length()
        StringBuilder x=new StringBuilder();
        for (int i = 0; i <word1.length()+word2.length() ; i++) {
            if (word1.length() > i) {
                x.append( word1.charAt(i));
            }
            if (word2.length() > i) {
                x.append( word2.charAt(i));
            }
        }
        return x.toString();
    }
}
