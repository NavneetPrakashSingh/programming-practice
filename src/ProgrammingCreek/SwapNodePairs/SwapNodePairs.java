package ProgrammingCreek.SwapNodePairs;

public class SwapNodePairs {
    ListNode node;

    public int size(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public int get(int index) {
        ListNode currentNode = node;
        int sizeOfLinkedList = size(node);
        for (int i = 0; i < sizeOfLinkedList; i++) {
            if (i == index) {
                return currentNode.val;
            } else {
                currentNode = currentNode.next;
            }
        }
        return -1;
    }

    public ListNode swapPairs(ListNode head) {
        node = head;
        ListNode current = head;
        ListNode prev = head;
        int sizeOfLinkedList = size(head);
        for (int i = 0; i < sizeOfLinkedList; i++) {
            if (i % 2 != 0) {
                int currentVal = current.val;
                int prevVal = prev.val;
                prev.val = currentVal;
                current.val = prevVal;
            }
            prev = current;
            current = current.next;
        }
        return node;
    }
}
