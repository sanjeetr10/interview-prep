package recursion.impl;

import org.junit.Test;
import recursion.RodCutting;

import static org.junit.Assert.*;

public class RodCuttingImplTest {

    @Test
    public void findMaxValueObtainedByCuttingAndSellingPieces() {
        RodCutting rodCutting = new RodCuttingImpl();

        int[] example1 = new int[]{1,5,8,9,10,17,17,20};
        int[] example2 = new int[]{3,5,8,9,10,17,17,20};

        assertEquals(22,rodCutting.findMaxValueObtainedByCuttingAndSellingPieces(example1,8));
        assertEquals(24,rodCutting.findMaxValueObtainedByCuttingAndSellingPieces(example2,8));
    }
}