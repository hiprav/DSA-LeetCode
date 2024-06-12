package com.leet_code;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Decode_String {
    public static void main(String[] args) {
        String str="10[a]2[bc3[d]]";
        System.out.println(decodeString(str));
    }
    public static String decodeString(String s) {// not yours

            Stack<Integer> numStack = new Stack<>();
            Stack<String> stringStack = new Stack<>();
            int k = 0;

            for (char c : s.toCharArray()) {

                if (Character.isDigit(c)) {
                    k = (k * 10) + (c - '0');
                    continue;
                }

                if (c == '[') {
                    numStack.push(k);
                    k = 0;
                    stringStack.push(String.valueOf(c));
                    continue;
                }

                if (c != ']') {
                    stringStack.push(String.valueOf(c));
                    continue;
                }

                StringBuilder temp = new StringBuilder();
                while (!stringStack.peek().equals("["))
                    temp.insert(0, stringStack.pop());

                // remove the "["
                stringStack.pop();

                // Get the new string
                StringBuilder replacement = new StringBuilder();
                int count = numStack.pop();
                for (int i = 0; i < count; i++)
                    replacement.append(temp);

                // Add it to the stack
                stringStack.push(replacement.toString());
            }

            StringBuilder result = new StringBuilder();
            while (!stringStack.empty()) {
                result.insert(0, stringStack.pop());
            }
            return result.toString();
        }
    public static String decodeString1(String s) {//more efficent
        Deque<Character> queue=new LinkedList<Character>();
        for(char sb:s.toCharArray())queue.offer(sb);
        return helper(queue);
    }

    public static String helper(Deque<Character> queue){
        StringBuilder sb=new StringBuilder();
        int num=0;
        while(!queue.isEmpty()){
            char temp=queue.poll();
            if(temp-'0'>=0 && temp-'0'<=9){
                num=num*10+temp-'0';
            }
            else if(temp=='['){
                String sub=helper(queue);
                while(num>0){
                    sb.append(sub);
                    num--;
                }
            }
            else if(temp==']'){
                break;
            }
            else{
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}
