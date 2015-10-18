package com.company;

/**
 * Created by kamil on 2015-10-18.
 */
public class Staircase {

    public static void main(String[] args) {
        final int in = 20;

        final StringBuilder sb = new StringBuilder();
        final String format = "%"+in+"s\n";

        for(int i=0; i<in; i++) {
            sb.append("#");
            System.out.printf(format,sb.toString());
        }

    }


}
