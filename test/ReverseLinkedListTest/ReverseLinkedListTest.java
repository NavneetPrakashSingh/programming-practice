package ReverseLinkedListTest;

import ProgrammingCreek.ReverseLinkedList.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseLinkedListTest {
    ListNode node;

    @Before
    public void setup() {
        node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);

    }

    @Test
    public void reverse() {
        ReverseLinkedList linkedList = new ReverseLinkedList();
        linkedList.reverseList(node);
        assertEquals(linkedList.get(0),3);
    }
}
