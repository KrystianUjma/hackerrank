package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Veezq on 2015-10-18.
 */
public class PrimesTest {

    private Primes primes = new Primes();
    private PrimesVersion2 primes2 = new PrimesVersion2();
    private Primes3 primes3 = new Primes3();

    @Test
    public void test1(){

        int result = primes3.solution(2, 10);

        assertEquals(4, result);
    }

    @Test
    public void test2(){

        int result = primes3.solution(1,10);

        assertEquals(4, result);
    }

    @Test
    public void test3(){

        int result = primes.solution(11, 19);

        assertEquals(4, result);
    }

    @Test
    public void testPrimes2(){

        int result = primes2.solution(11, 19);

        assertEquals(4, result);
    }

    @Test
    public void testPrimes3(){

        int result = primes3.solution(11, 19);

        assertEquals(4, result);
    }
}