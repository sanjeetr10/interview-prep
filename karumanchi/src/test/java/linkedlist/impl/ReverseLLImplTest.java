package linkedlist.impl;

import linkedlist.ReverseLL;
import linkedlist.model.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static linkedlist.impl.TestHelper.DEFAULT_SIZE;
import static org.junit.Assert.*;

public class ReverseLLImplTest {

    TestHelper helper = new TestHelper();

    ReverseLL reverseLL = new ReverseLLImpl();

    List<ListNode> originalList = new ArrayList<>(DEFAULT_SIZE);

    @Test
    public void reverse() {

        ListNode head = helper.getList();

        addNodesToList(head);

        ListNode reverse = reverseLL.reverse(head);

        checkForEquals(reverse);

    }

    private void checkForEquals(ListNode head) {

        ListNode curr = head;

        for (int n = originalList.size(), i = n; i >= 0; i--){

            assertEquals(originalList.get(i), curr);
            curr = curr.next;
        }
    }

    private void addNodesToList(ListNode head) {
        ListNode curr = head;

        while (curr != null){
            originalList.add(curr);
            curr = curr.next;
        }
    }
}