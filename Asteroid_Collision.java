package com.leet_code;

import java.util.Arrays;
import java.util.Stack;

public class Asteroid_Collision {
    public static void main(String[] args) {
        int[] arr={8,-8};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }
    public static int[] asteroidCollision(int[] ast) {//is not working well
        Stack<Integer> srr=new Stack<>();
        srr.push(ast[0]);
        for (int i = 1; i < ast.length; i++) {
            if (ast[i] < 0 && srr.peek()>=0) {//collide condition
                if(Math.abs(srr.peek()) == Math.abs(ast[i])){
                    srr.pop();
                }
                if (Math.abs(srr.peek()) > Math.abs(ast[i])) {
                    srr.push(ast[i]);
                }else {//           10                  -11
                    while(Math.abs(srr.peek()) < Math.abs(ast[i]) && srr.peek()>0 && ast[i]<0) {
                        srr.pop();
                    }
                    srr.push(ast[i]);
                }
            }else {
                srr.push(ast[i]);
            }
        }
        int[] arr=new int[srr.size()];
        for (int i = 0; i < srr.size(); i++) {
            arr[i]=srr.get(i);
        }
        return arr;
    }
    public int[] asteroidCollision1(int[] asteroids) {// online chapa
        int[] stack = new int[asteroids.length];
        int top = -1;
        for (int g : asteroids) {
            if (top == -1) {
                stack[++top] = g;
            } else {
                if (g < 0) {
                    if (stack[top] < 0) {
                        stack[++top] = g;
                    } else {
                        while (top >= 0 && stack[top] > 0 && stack[top] < (-g)) {
                            top--;
                        }
                        if (top >= 0) {
                            if (stack[top] > 0 && stack[top] == (-g)) {
                                top--;
                            } else if (stack[top] < 0) {
                                stack[++top] = g;
                            }
                        } else {
                            stack[++top] = g;
                        }
                    }
                } else {
                    stack[++top] = g;
                }
            }
        }
        int[] ans = new int[top + 1];
        for (int i = 0; i <= top; i++) {
            ans[i] = stack[i];
        }
        return ans;
    }
}
