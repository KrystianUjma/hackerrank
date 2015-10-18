package com.company;

import java.util.*;

/**
 * Created by kamil on 2015-10-11.
 */
public class CoinChangeProblem {

    public static void main(String[] args) {
        int n = 4;
        int[] array = new int[]{ 1, 2, 3 };
        Arrays.sort(array);

        System.out.println(solve(n, array, 0));
    }

    private static List<Integer> getList(int[] ints) {
        List<Integer> list = new ArrayList<>(ints.length);
        for(int i : ints) {
            list.add(i);
        }
        return list;
    }

    static int[][] tab = new int[1001][6];


    private static int solve(int sum, int[] array, int index) {
        if (sum < 0)  return 0;
        if (sum == 0) return 1;
        if(tab[sum][index]>0) { return tab[sum][index]; }

        // means coins over and sum>0 so no solution
        if (index == array.length && sum > 0) {
            tab[sum][index] = 0;
            return tab[sum][index];
        }

        tab[sum][index] = solve(sum - array[index], array, index) + solve(sum, array, index + 1);
        return tab[sum][index];
    }
}
