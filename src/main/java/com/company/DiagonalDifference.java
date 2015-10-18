package com.company;

import java.util.Scanner;

/**
 * Created by kamil on 2015-10-18.
 */
public class DiagonalDifference {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = createArray(size, scanner);

        System.out.println(solve(array));
    }

    public static int[][] createArray(int size, Scanner scanner){
        int[][] array = new int[size][size];
        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                array[x][y] = scanner.nextInt();
            }
        }

        return array;
    }

    public static int solve(int[][] array){
        int size = array.length;

        int sum1 = 0;
        int sum2 = 0;

        for(int x = 0; x < size; x++){
            sum1 += array[x][x];
        }

        for(int y = 0; y < size; y++){
            sum2 += array[size - y -1][y];
        }


        return Math.abs(sum1 - sum2);
    }
}
