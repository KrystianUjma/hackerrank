package com.company;

import java.util.*;
import java.util.function.Function;

/**
 * Created by kamil on 2015-10-11.
 */
public class CoinChangeProblem2 {

    public static void main(String[] args) {
//        int n = 4;
//        int[] array = new int[]{ 1, 2, 3 };
//        Arrays.sort(array);
//
//        System.out.println(solve(n, array, 0));


//        Comparator<String> comp = Comparator.comparing(String::length);
//
//        Comparator<String> comp2 = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length()==o2.length()) return 0;
//                return o1.length()>o2.length()?1:-1;
//            }
//        };
//
//        List<String> list = Arrays.asList("aa", "cccc", "b");
//        System.out.println("PRZED -----------------");
//        list.forEach(System.out::println);
//        Collections.sort(list, comp2);
//        System.out.println("PO -----------------");
//        list.forEach(System.out::println);

        loop: for(int i=0; i<100; i++) {
            System.out.println("loop 1");
            chuj: while(1==1) {
                System.out.println("loop 2");
                break chuj;
            }
        }
    }

    private static List<Integer> getList(int[] ints) {
        List<Integer> list = new ArrayList<>(ints.length);
        for(int i : ints) {
            list.add(i);
        }
        return list;
    }


    private static int solve(int sum, int[] array, int index) {
        if (sum < 0)  return 0;
        if (sum == 0) return 1;

        // means coins over and sum>0 so no solution
        if (index == array.length && sum > 0) return 0;
        return solve(sum - array[index], array, index) + solve(sum, array, index + 1);
    }



}
