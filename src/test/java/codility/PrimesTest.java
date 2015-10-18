package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Veezq on 2015-10-18.
 */
public class PrimesTest {

    private Primes primes = new Primes();

    @Test
    public void test1(){

        int result = primes.solution(2, 10);

        assertEquals(4, result);
    }

    @Test
    public void test2(){

        int result = primes.solution(1,10);

        assertEquals(4, result);
    }
}