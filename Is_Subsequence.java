package com.leet_code;

public class Is_Subsequence {
    public static void main(String[] args) {
        String s = "", t = "bbaabaabaaabbaaaaa";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        if (s == "") {
            return true;
        }
        int a=0,b=0,r=0;
       while (b<t.length() && a<s.length()){
           char x=s.charAt(a),y=t.charAt(b);
           if (s.charAt(a) == t.charAt(b)) {
               r++;
               a++;
           }
           b++;
       }
       return r==s.length();
    }
    public boolean isSubsequence1(String s, String t) { // must approch
        if (s.length()<1)
            return true;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        for (int i=0, c=0;i<b.length;i++)
        {
            if(a[c]==b[i])
                c++;
            if (c==a.length)
                return true;
        }
        return false;
    }
}
