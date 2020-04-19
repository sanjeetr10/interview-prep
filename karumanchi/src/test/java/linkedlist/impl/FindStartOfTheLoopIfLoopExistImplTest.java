package linkedlist.impl;

import linkedlist.FindStartOfTheLoopIfLoopExist;
import linkedlist.model.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindStartOfTheLoopIfLoopExistImplTest {

    TestHelper helper = new TestHelper();
    FindStartOfTheLoopIfLoopExist startOfTheLoopIfLoopExist = new FindStartOfTheLoopIfLoopExistImpl();

    @Test
    public void findStartOfTheLoop() {
        ListNode actualStart = startOfTheLoopIfLoopExist.findStartOfTheLoop(helper.getListWithCycle());
        ListNode expectedStart = helper.getStartOfCycleNode();

        assertEquals(expectedStart, actualStart);
    }
}