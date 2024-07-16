package com.leet_code;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] a={'x','x','y'};
        System.out.println(nextGreatestLetter(a,'y'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        if (target >=letters[letters.length-1]) {
            return letters[0];
        }
        int s=0;
        int e=letters.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (target<letters[mid]) {
                    e=mid-1;
            } else {
                s=mid+1;
            }
        }
        return letters[s];
    }
}
