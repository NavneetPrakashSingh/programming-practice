package Leetcode.Easy.DesignLinkedList;

class Node {
    int val;
    Node next;

    Node() {
        this.next = null;
    }

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MyLinkedList {
    Node node = null;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
//        node = new Node();
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        int linkedListSize = size(node);
        Node helper = node;
        for (int i = 0; i < linkedListSize; i++) {
            if (i == index) {
                return helper.val;
            } else {
                helper = helper.next;
            }
        }
        return -1;
    }

    public int size(Node node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        int sizeOfLinkedList = size(node);
        Node newNode = new Node(val);
        if (node == null) {
            node = newNode;
        } else {
            newNode.next = node;
            node = newNode;
        }
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        int sizeOfLinkedList = size(node);
        Node nextElement = new Node(val);
        if (node == null) {
            //linked list is empty
            node = nextElement;
        } else {
            Node prev = node;
            for (int i = 0; i < sizeOfLinkedList; i++) {
                if (prev.next == null) {
                    prev.next = nextElement;
                } else {
                    prev = prev.next;
                }
            }
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        int sizeOfLinkedList = size(node);
        Node newNode = new Node(val);
        Node prev = node;
        for (int i = 0; i < sizeOfLinkedList; i++) {
            if (i + 1 == index) {
                newNode.next = prev.next;
                prev.next = newNode;
            } else {
                prev = prev.next;
            }
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        int sizeOfLinkedList = size(node);
        if (index < sizeOfLinkedList && index > 0) {
            Node helper = node;
            Node prev = node;
            for (int i = 0; i < sizeOfLinkedList; i++) {
                if (i + 1 == index) {
                    prev.next = helper.next.next;
                } else {
                    prev = helper;
                    helper = helper.next;
                }
            }
        }
    }
}
