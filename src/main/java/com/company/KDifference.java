package com.company;

/**
 * Created by kamil on 2015-10-11.
 */
public class KDifference {

    public static void main(String[] args) {
        int k = 2;
        int[] array = new int[] { 1, 5, 3, 4, 2};
        System.out.println(solve(k, array));
    }

    static private int solve(int k, int[] array) {
        int counter = 0;
        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                int a = array[i];
                int b = array[j];
                System.out.println(a+" "+b);
                if(Math.abs(a-b)>=k) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }


}
