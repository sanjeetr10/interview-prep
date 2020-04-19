package linkedlist.impl;

import linkedlist.model.ListNode;

import java.util.OptionalInt;

public class TestHelper {

    private ListNode cycleHead = null;
    private ListNode normalHead = null;
    private ListNode cycleLastNode = null;
    private ListNode normalLastNode = null;
    private ListNode startOfCycleNode = null;

    public static final int DEFAULT_SIZE = 9;
    public static final int DEFAULT_START_OF_CYCLE = 5;

    public ListNode getListWithCycle(){
        return getListWithCycle(DEFAULT_SIZE,DEFAULT_START_OF_CYCLE);
    }

    public ListNode getList(){
        return getList(DEFAULT_SIZE, OptionalInt.empty());
    }

    public ListNode getListWithCycle(int size, int startOfCycle) {

        for (int i = 1; i <= size; i++) {

            ListNode newNode = new ListNode(i);

            if (i == startOfCycle) {
                startOfCycleNode = newNode;
            }

            if (cycleHead == null) {
                cycleHead = newNode;
                cycleLastNode = newNode;
            } else {
                cycleLastNode.next = newNode;
                cycleLastNode = newNode;
            }
        }

        cycleLastNode.next = startOfCycleNode;

        return cycleHead;
    }


    public ListNode getStartOfCycleNode() {
        return startOfCycleNode;
    }

    public ListNode getList(int size, OptionalInt withMissing) {

        for (int i = 1; i <= size; i++) {

            if(withMissing.isPresent() && i == withMissing.getAsInt()){
                continue;
            }

            ListNode newNode = new ListNode(i);

            if (normalHead == null) {
                normalHead = newNode;
                normalLastNode = newNode;
            } else {
                normalLastNode.next = newNode;
                normalLastNode = newNode;
            }
        }

        return normalHead;
    }
}
