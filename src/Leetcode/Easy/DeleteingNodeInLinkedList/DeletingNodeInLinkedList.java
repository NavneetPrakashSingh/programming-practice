package Leetcode.Easy.DeleteingNodeInLinkedList;

import java.util.Arrays;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }
}

public class DeletingNodeInLinkedList {
    ListNode head;

    public void deleteNode(ListNode node) {
        if (node.next == null) {
            node = null;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public ListNode removeNthFromList(ListNode head, int n) {
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode p = helper;

        while (p.next != null) {
            if (p.next.val == n) {
                ListNode next = p.next;
                p.next = next.next;
            } else {
                p = p.next;
            }
        }
        return helper.next;
    }

    public int size(ListNode head) {
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }
        return i;
    }


    public void printList(ListNode node) {
        while (node.next != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        DeletingNodeInLinkedList list = new DeletingNodeInLinkedList();
        list.head = node;
//        ListNode deleteNode = new ListNode(1);

//        list.deleteNode(deleteNode);
        ListNode newListNode = list.removeNthFromList(node, 2);
        list.printList(newListNode);

    }
}
