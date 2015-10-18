package com.company;

import java.util.Scanner;

/**
 * Created by kamil on 2015-10-10.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        String a = "123";
        String b = "abc";
        System.out.println(a.concat(b));

        loop: for(int i=0; i<5; i++) {
            
        }

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        for(int i=1; i<=n; i++) {
//            System.out.println(solve(i));
//        }
    }

    private static String solve(int n) {
        if(n%5==0 && n%3==0) return "FizzBuzz";
        if(n%3==0) return "Fizz";
        if(n%5==0) return "Buzz";
        return n+"";
    }

}
