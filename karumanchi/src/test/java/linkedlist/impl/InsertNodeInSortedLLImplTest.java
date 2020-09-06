package linkedlist.impl;

import linkedlist.InsertNodeInSortedLL;
import linkedlist.model.ListNode;
import org.junit.Test;

import java.util.OptionalInt;

import static org.junit.Assert.assertEquals;

public class InsertNodeInSortedLLImplTest {

    TestHelper helper = new TestHelper();

    InsertNodeInSortedLL inSortedLL = new InsertNodeInSortedLLImpl();

    @Test
    public void insert() {

        ListNode head = helper.getList(10, OptionalInt.of(3));
        inSortedLL.insert(head, new ListNode(3));

        assertEquals(3, head.next.next.getData());
    }
}