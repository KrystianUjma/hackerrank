package com.company;

/**
 * Created by kamil on 2015-10-10.
 */
public class NumberComplement {

//    int i = 100_000;

    public static void main(String[] args) {
        int n = 100;
        print(getIntegerComplement1(n));
        print(getIntegerComplement2(n));
    }

    private static void print(int i) {
        String out = Integer.toBinaryString(i);
        out = String.format("%8s",out).replace(" ","0");
        System.out.println(i+" = "+out);
    }

    private static int getIntegerComplement1(int n) {
        String o = Integer.toBinaryString(n);
        o = o.replace("0", "2").replace("1", "0").replace("2", "1");
        return Integer.parseInt(o, 2);
    }

    private static int getIntegerComplement2(int n) {
        return (Integer.highestOneBit(n)<<1) -1 -n;
    }

}
