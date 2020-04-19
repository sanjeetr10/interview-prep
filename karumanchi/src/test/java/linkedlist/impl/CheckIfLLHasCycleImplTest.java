package linkedlist.impl;

import linkedlist.CheckIfLLHasCycle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfLLHasCycleImplTest {

    TestHelper helper = new TestHelper();

    @Test
    public void checkForCycleTrue() {

        CheckIfLLHasCycle checkIfLLHasCycle = new CheckIfLLHasCycleImpl();
        boolean hasCycle = checkIfLLHasCycle.checkForCycle(helper.getListWithCycle());
        assertTrue(hasCycle);
    }

    @Test
    public void checkForCycleFalse(){
        CheckIfLLHasCycle checkIfLLHasCycle = new CheckIfLLHasCycleImpl();
        boolean hasCycle = checkIfLLHasCycle.checkForCycle(helper.getList());
        assertFalse(hasCycle);
    }
}