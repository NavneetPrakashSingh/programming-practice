package ProgrammingCreek.ReverseLinkedList;

public class ReverseLinkedList {
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
        ListNode current = node;
        int sizeOfLinkedList = size(current);
        for (int i = 0; i < sizeOfLinkedList; i++) {
            if (i == index) {
                return current.val;
            } else {
                current = current.next;
            }
        }
        return -1;
    }

    public ListNode reverseList(ListNode head) {
        node = head;
        ListNode forward = head;
        ListNode backward = head;
        int size = size(head);
        for (int i = 0; i < size; i++) {
            forward = backward;
            for (int j = 0; j < size - i - 1; j++) {
                int currentVal = forward.val;
                int nextVal = forward.next.val;
                forward.next.val = currentVal;
                forward.val = nextVal;
                forward = forward.next;
            }
        }
        return forward;
    }
}
