package codility;

import java.util.Arrays;

/**
 * Created by kamil on 2015-10-17.
 */
public class Solution1 {

    public int solution(int[] a){
        Arrays.sort(a);

        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < a.length - 1; i++) {
            int first = a[i];
            int second = a[i+1];

            int result = second - first;
            if(result < minLength){
                minLength = result;
            }
        }

        return minLength;
    }

}
