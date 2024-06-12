package com.leet_code;

public class Greatest_Common_Divisor_of_Strings {
    public static void main(String[] args) {
                String a="ABABABAB";
        String b="ABAB";
        System.out.println(gcdOfStrings(a,b));
    }
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcd = gcd(str1.length(), str2.length());
        return str2.substring(0, gcd);
    }
    public static int gcd(int a, int b) {  //this complex to under stand
        if(b == 0){
            return a;
        }else {
            gcd(b, a % b);
        }
        return b;
    }

}
