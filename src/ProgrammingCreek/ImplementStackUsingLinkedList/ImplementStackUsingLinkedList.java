package ProgrammingCreek.ImplementStackUsingLinkedList;

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

public class ImplementStackUsingLinkedList {
    //works on lifo
    Node node;

    public ImplementStackUsingLinkedList() {

    }

    public int pop() {
        int sizeOfLinkedList = size(node);
        Node helper = node;
        if (sizeOfLinkedList != 0) {
            for (int i = 0; i < sizeOfLinkedList; i++) {
                if (i + 1 == sizeOfLinkedList-1) {
                    int returningValue = helper.next.val;
                    helper.next = null;
                    return returningValue;
                } else {
                    helper = helper.next;
                }
            }
        }
        return -1;
    }

    public boolean push(int val) {
        int sizeOfLinkedList = size(node);
        Node newNode = new Node(val);
        Node helper = node;
        if (node == null) {
            node = newNode;
            return true;
        } else {
            for (int i = 0; i < sizeOfLinkedList; i++) {
                if (i + 1 == sizeOfLinkedList) {
                    helper.next = newNode;
                    return true;
                } else {
                    helper = helper.next;
                }
            }
        }
        return false;
    }

    public int get(int index){
        int sizeOfLinkedList = size(node);
        Node helper = node;
        for (int i = 0; i < sizeOfLinkedList; i++) {
            if(i == index){
                return helper.val;
            }else{
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
}
