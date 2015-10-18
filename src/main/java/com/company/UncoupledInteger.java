package com.company;

/**
 * Created by kamil on 2015-10-10.
 */
public class UncoupledInteger {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 99, 1, 2, 3, 4, 5};
        int answer = new UncoupledInteger().solve(array);
        System.out.println(answer);
    }

    private int solve(int[] array) {
        int out = 0;
        for(int i=0; i<array.length; i++) {
            out ^= array[i];
        }
        return out;
    }

}
