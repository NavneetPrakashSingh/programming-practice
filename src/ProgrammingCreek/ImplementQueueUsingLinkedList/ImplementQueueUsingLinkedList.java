package ProgrammingCreek.ImplementQueueUsingLinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ImplementQueueUsingLinkedList {
    Node node;

    public boolean enqueue(int val) {
        Node current = new Node(val);
        if (node == null) {
            node = current;
            return true;
        } else {
            int sizeOfLinkedList = size(node);
            Node helper = node;
            for (int i = 0; i < sizeOfLinkedList; i++) {
                if (i + 1 == sizeOfLinkedList) {
                    helper.next = current;
                    return true;
                } else {
                    helper = helper.next;
                }
            }
        }
        return false;
    }

    public int dequeue() {
        int sizeOfLinkedList = size(node);
        if (sizeOfLinkedList <= 0) {
            return -1;
        } else {
            int val = node.val;
            node = node.next;
            return val;
        }
    }

    public int size(Node node) {
        int current = 0;
        while (node != null) {
            current++;
            node = node.next;
        }
        return current;
    }
}
