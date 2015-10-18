package codility;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Veezq on 2015-10-18.
 */
public class Solution1Test {

    private Solution1 solution1 = new Solution1();

    @Test
    public void test1(){
        int[] a = new int[]{8, 24, 3, 20, 1, 17};

        int result = solution1.solution(a);

        assertEquals(2, result);
    }

    @Test
    public void test2(){
        int[] a = new int[]{7, 21, 3, 42, 3, 7};

        int result = solution1.solution(a);

        assertEquals(0, result);
    }

}