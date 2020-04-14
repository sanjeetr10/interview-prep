package linkedlist.impl;

import linkedlist.StackUsingLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackUsingLLTest {

    @Test
    public void pop() {

        StackUsingLinkedList stack = new StackUsingLL();

        stack.push(10);
        stack.push(11);
        stack.push(12);

        assertEquals(12, stack.peek());
        assertEquals(12, stack.top());

        stack.pop();

        assertEquals(11,stack.pop());
    }
}