package com.company;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by kamil on 2015-10-10.
 */
public class BalancedDelimiters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println(solve(s));
    }

    private static boolean solve(String in) {
        Stack<Character> stack = new Stack<>();
        char[] chars = in.toCharArray();
        for(int i=0; i<chars.length; i++) {
            char c = chars[i];
            if(isOpening(c)) { stack.push(c); }
            else {
                if(stack.isEmpty()) return false;
                if(getOpening(c)!=stack.pop()) return false;
            }
        }
        return stack.isEmpty();
    }

    private static Character getOpening(char c) {
        switch(c) {
            case ')': return '(';
            case '}': return '{';
            case ']': return '[';
            default : throw new RuntimeException();
        }
    }

    private static boolean isOpening(char c) {
        switch(c) {
            case '(': return true;
            case '{': return true;
            case '[': return true;
            default : return false;
        }
    }

}
