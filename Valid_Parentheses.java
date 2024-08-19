package com.leet_code;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
     String str="(]";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.empty() && stack.peek() == '(' && s.charAt(i)==')') {
                stack.pop();
            } else if (!stack.empty() && stack.peek() == '{' && s.charAt(i)=='}') {
                stack.pop();
            } else if (!stack.empty() && stack.peek() == '[' && s.charAt(i)==']') {
                stack.pop();
            } else {
                stack.add(s.charAt(i));
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}
