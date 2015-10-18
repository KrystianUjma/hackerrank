package codility;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Veezq on 2015-10-18.
 */
public class Solution2Test {

    private Solution2 solution2 = new Solution2();
    
    @Test
    public void test0(){
        int result = solution2.solution(0);
        assertEquals(1, result);
    }

    @Test
    public void test1(){
        int result = solution2.solution(1);
        assertEquals(4, result);
    }

    @Test
    public void test2(){
        int result = solution2.solution(2);
        assertEquals(4, result);
    }

    @Test
    public void test3(){
        int result = solution2.solution(8);
        assertEquals(4, result);
    }

}