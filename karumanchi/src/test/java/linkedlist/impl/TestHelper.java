package linkedlist.impl;

import com.sun.org.apache.bcel.internal.generic.LNEG;
import linkedlist.model.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class TestHelper {

    private ListNode cycleHead = null;
    private ListNode normalHead = null;
    private ListNode cycleLastNode = null;
    private ListNode normalLastNode = null;
    private ListNode startOfCycleNode = null;

    public static final int DEFAULT_SIZE = 9;
    public static final int DEFAULT_START_OF_CYCLE = 5;

    public ListNode getListWithCycle() {
        return getListWithCycle(DEFAULT_SIZE, DEFAULT_START_OF_CYCLE);
    }

    public ListNode getList() {
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

            if (withMissing.isPresent() && i == withMissing.getAsInt()) {
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


    public List<ListNode> getMergeList() {

        ListNode h1 = new ListNode(1);
        ListNode th1 = h1;
        ListNode h2 = new ListNode(1);
        ListNode th2 = h2;

        ListNode lastTwoNode = new ListNode(3);
        lastTwoNode.next = new ListNode(4);

        h1.next = new ListNode(2);
        th1 = h1.next;

        //point 2 to 3

        th1.next = lastTwoNode;

        h2.next = new ListNode(9);
        th2 = h2.next;

        th2.next = new ListNode(10);

        th2 = th2.next;

        //point 2nd list to 3

        th2.next = lastTwoNode;

        List<ListNode> res = new ArrayList<>();
        res.add(h1);
        res.add(h2);
        res.add(lastTwoNode);

        return res;

    }

    public List<ListNode> getListWithMiddle(int size) {

        ListNode h1 = new ListNode(1);
        ListNode th1 = h1;
        ListNode midPointer = null;

        int mid = size/2 +1 ;

        for (int i = 2; i <= size; i++) {
            ListNode n = new ListNode(i);
            th1.next = n;
            th1 = n;

            if(i==mid){
                midPointer = th1;
            }
        }

        List<ListNode> res = new ArrayList<>();
        res.add(h1);
        res.add(midPointer);

        return res;
    }

    public List<Integer> getListWithElementsFromEnd(int size) {

        ListNode h1 = new ListNode(1);
        ListNode th1 = h1;

        List<Integer> res = new ArrayList<>(size);

        for (int i = 2; i <= size; i++) {
            ListNode n = new ListNode(i);
            th1.next = n;
            th1 = n;
        }

       for(int i= size; i> 0;i--){
            res.add(i);
       }

        return res;
    }
}
