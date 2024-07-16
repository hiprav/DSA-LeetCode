package com.leet_code;

import java.util.HashMap;

public class Roman_to_Integer {
    public static void main(String[] args) {
      String s="MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            char x=s.charAt(i);
            if (i<s.length()-1 && hash.get(x)<hash.get(s.charAt(i+1))){
                sum+=hash.get(s.charAt(i+1))-hash.get(x);
                i++;
            } else if (x=='M') {
                sum+=hash.get(x);
            } else if (x=='D') {
                sum+=hash.get(x);
            } else if (x=='C') {
                sum+=hash.get(x);
            } else if (x=='L') {
                sum+=hash.get(x);
            } else if (x=='X') {
                sum+=hash.get(x);
            } else if (x=='V') {
                sum+=hash.get(x);
            } else if (x=='I') {
                sum+=hash.get(x);
            }
        }
        return sum;
    }
}
