package SwapNodePairTest;

import ProgrammingCreek.ReverseLinkedList.ReverseLinkedList;
import ProgrammingCreek.SwapNodePairs.ListNode;
import ProgrammingCreek.SwapNodePairs.SwapNodePairs;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapNodePairTest {
    ListNode node;

    @Before
    public void setup() {
        node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);

    }

    @Test
    public void swapNodePairOddList() {
        SwapNodePairs linkedList = new SwapNodePairs();
        linkedList.swapPairs(node);
        assertEquals(linkedList.get(1),1);
    }

    @Test
    public void swapNodePairEvenList() {
        node.next.next.next = new ListNode(4);
        SwapNodePairs linkedList = new SwapNodePairs();
        linkedList.swapPairs(node);
        assertEquals(linkedList.get(3),3);
    }
}
