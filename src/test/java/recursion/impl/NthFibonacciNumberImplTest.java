package recursion.impl;


import org.junit.Test;
import recursion.NthFibonacciNumber;

import static org.junit.Assert.assertEquals;

public class NthFibonacciNumberImplTest {

    NthFibonacciNumber nthFibonacciNumber = new NthFibonacciNumberImpl();

    @Test
    public void findNthFibonacciNumber() {
        int zeroTh = nthFibonacciNumber.findNthFibonacciNumber(0);
        assertEquals(0, zeroTh);
        assertEquals(1, nthFibonacciNumber.findNthFibonacciNumber(2));
        assertEquals(34, nthFibonacciNumber.findNthFibonacciNumber(9));
    }
}