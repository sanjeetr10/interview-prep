package dp.impl;

import static org.junit.Assert.*;

public class TrappingRainWaterTest {

    public void trap() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, trappingRainWater.trap(arr));

        arr = new int[]{4,2,0,3,2,5};
        assertEquals(9, trappingRainWater.trap(arr));
    }

}