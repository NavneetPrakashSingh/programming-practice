package ProgrammingCreek.ReverseLinkedListII;

public class ReverseLinkedListII {
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

    public ListNode reverseList(ListNode head, int m, int n) {
        node = head;
        ListNode helper = head;
        ListNode current = head;
        int sizeOfLinkedList = size(head);
        int reverseCount = 0;
        for (int i = 0; i < sizeOfLinkedList; i++) {
            helper = current;
            if (i >= m - 1 && i <= n - 1) {
                for (int j = m ; j <= n - reverseCount - 1; j++) {
                    int currentVal = helper.val;
                    int nextValue = helper.next.val;
                    helper.val = nextValue;
                    helper.next.val = currentVal;

                    helper = helper.next;
                }
                reverseCount++;
            }
            current = current.next;
        }
        return node;
    }
}
