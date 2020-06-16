package ReverseLinkedListIITest;


import ProgrammingCreek.ReverseLinkedListII.ListNode;
import ProgrammingCreek.ReverseLinkedListII.ReverseLinkedListII;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseLinkedListIITest {
    ListNode node;

    @Before
    public void setup() {
        node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);

    }

    @Test
    public void reverse() {
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ReverseLinkedListII linkedList = new ReverseLinkedListII();
        linkedList.reverseList(node, 2, 4);
        assertEquals(linkedList.get(1), 4);
    }
}
