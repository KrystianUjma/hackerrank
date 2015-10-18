package com.company;

import java.math.BigInteger;

/**
 * Created by kamil on 2015-10-11.
 */
public class Factorial {

    public static void main(String[] args) {
        Factorial solution = new Factorial();
        int n = 20;
        System.out.println(solution.solve(n));
    }

    private BigInteger solve(int n) {
        if(n<=0) { return BigInteger.ONE; }
        BigInteger sum = BigInteger.ONE;
        for(int i=2; i<=n; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }

}
