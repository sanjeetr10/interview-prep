package linkedlist.impl;

import linkedlist.CheckIfLLHasCycle;
import linkedlist.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfLLHasCycleImplTest {

    ListNode cycleHead = null;
    ListNode normalHead = null;
    ListNode lastNode = null;
    ListNode normalLastNode = null;
    ListNode thirdNode = null;
    private int SIZE = 8;

    @Before
    public void setup() {
        //Linked List of 10 nodes

        for (int i = 0; i < SIZE; i++) {

            ListNode newNode = new ListNode(i);

            if(i==2){
                thirdNode = newNode;
            }

            if (cycleHead == null) {
                cycleHead = newNode;
                normalHead = newNode;
                lastNode = newNode;
                normalLastNode = newNode;
            } else {
                lastNode.next = newNode;
                normalLastNode.next = newNode;
                lastNode = newNode;
                normalLastNode = newNode;
            }
        }

        lastNode.next = thirdNode;
    }

    @Test
    public void checkForCycleTrue() {

        CheckIfLLHasCycle checkIfLLHasCycle = new CheckIfLLHasCycleImpl();
        boolean hasCycle = checkIfLLHasCycle.checkForCycle(cycleHead);
        assertTrue(hasCycle);
    }

    @Test
    public void checkForCycleFalse(){
        CheckIfLLHasCycle checkIfLLHasCycle = new CheckIfLLHasCycleImpl();
        boolean hasCycle = checkIfLLHasCycle.checkForCycle(normalHead);
        assertFalse(hasCycle);
    }
}