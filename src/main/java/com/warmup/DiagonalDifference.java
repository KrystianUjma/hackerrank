package com.warmup;

import java.util.Scanner;

/**
 * Created by Veezq on 2015-11-05.
 */
public class DiagonalDifference {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner("3\n" +
//                                      "11 2 4\n" +
//                                      "4 5 6\n" +
//                                      "10 8 -12");


        Scanner scanner = new Scanner("9\n" +
                "6 6 7 -10 9 -3 8 9 -1\n" +
                "9 7 -10 6 4 1 6 1 1\n" +
                "-1 -2 4 -6 1 -4 -6 3 9\n" +
                "-8 7 6 -1 -6 -6 6 -7 2\n" +
                "-10 -4 9 1 -7 8 -5 3 -5\n" +
                "-8 -3 -4 2 -3 7 -5 1 -5\n" +
                "-2 -7 -4 8 3 -1 8 2 3\n" +
                "-3 4 6 -7 -7 -8 -3 9 -6\n" +
                "-2 0 5 4 4 4 -3 3 0"); // returns 52

        int size = scanner.nextInt();

        int[][] array = fillArray(size, scanner);
        int result = solve(array);

        System.out.println(result);

    }

    private static int[][] fillArray(int size, Scanner scanner){
        int[][] array = new int[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }

    private static int solve(int[][] array){
        int size = array.length;

        int sum1 = 0;
        int sum2 = 0;

        for(int x = 0; x < size; x++){
            sum1 += array[x][x];
        }

        for(int y = 0; y < size; y++){
            sum2 += array[y][size - y - 1];
        }

        return sum2 - sum1;
    }
}
