package com.company;

import java.math.BigInteger;

/**
 * Created by kamil on 2015-10-11.
 */
public class Fibonacci {

//    BigInteger bigInteger = new BigInteger(218922995834555169026);

    public static void main(String[] args) {
        long start = System.nanoTime();
        Fibonacci fibonacci = new Fibonacci();
        int n;
        for(int i=0; i<100; i++) {
            n = i;
            System.out.println(n+">"+fibonacci.solve(n));
        }
        System.out.println("time = "+(System.nanoTime()-start)/1_000_000);
    }

    static BigInteger[] tab = new BigInteger[101];

    private BigInteger solve(int n) {
        if(n<=0) return BigInteger.ZERO;
        if(n==1) return BigInteger.ONE;
        if(tab[n]!=null) return tab[n];
        tab[n] = solve(n-2).add(solve(n-1));
        return tab[n];
    }
}
