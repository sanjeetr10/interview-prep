package recursion.impl;

import org.junit.Test;
import recursion.CoinChange;

import static org.junit.Assert.*;

public class CoinChangeImplTest {

    CoinChange coinChange = new CoinChangeImpl();

    @Test
    public void numberOfWaysToMakeChange() {

        int sum4 = coinChange.numberOfWaysToMakeChange(new int[]{1,2,3},3,4);
        int sum10 = coinChange.numberOfWaysToMakeChange(new int[]{2,5,3,6},4,10);

        assertEquals(4, sum4);
        assertEquals(5, sum10);
    }
}