package com.company;

import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by kamil on 2015-10-18.
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\Z");
        float count = Integer.parseInt(scanner.next());

        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        while(scanner.hasNext()){
            int val = scanner.nextInt();

            if(val > 0)      positiveCounter++;
            else if(val < 0) negativeCounter++;
            else             zeroCounter++;
        }

        System.out.printf(Locale.US, "%.3f\n", positiveCounter / count);
        System.out.printf(Locale.US, "%.3f\n", negativeCounter / count);
        System.out.printf(Locale.US, "%.3f\n", zeroCounter / count);
    }

}
