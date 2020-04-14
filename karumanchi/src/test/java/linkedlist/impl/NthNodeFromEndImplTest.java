package linkedlist.impl;

import com.sun.org.apache.bcel.internal.generic.LNEG;
import linkedlist.ListNode;
import linkedlist.NthNodeFromEnd;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthNodeFromEndImplTest {

    ListNode head = null;
    ListNode lastNode = null;
    private int SIZE = 10;

    @Before
    public void setup() {
        //Linked List of 10 nodes

        for (int i = 0; i < SIZE; i++) {
            ListNode newNode = new ListNode(i);

            if (head == null) {
                head = newNode;
                lastNode = newNode;
            } else {
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }
    }

    @Test
    public void nthNode() {

        NthNodeFromEnd nthNodeFromEnd = new NthNodeFromEndImpl();

        ListNode thirdFromEnd = nthNodeFromEnd.nthNode(head, 3);

        assertEquals(7, thirdFromEnd.data);

        //add one more
        lastNode.next = new ListNode(99);
        lastNode = lastNode.next;

        assertEquals(lastNode, nthNodeFromEnd.nthNode(head, 1));
    }
}