package Leetcode.Easy.MyLinkedListTest;

import Leetcode.Easy.DesignLinkedList.MyLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {
    MyLinkedList linkedList;

    @Before
    public void setup() {
        linkedList = new MyLinkedList();

    }

    @Test
    public void testGetMethod() {
        assertEquals(linkedList.get(0), -1);
    }

    @Test
    public void testAddAtTail() {
        linkedList.addAtTail(2);
        assertEquals(linkedList.get(0), 2);
    }

    @Test
    public void testAddTwoElementsAtTail() {
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        assertEquals(linkedList.get(0), 2);
        assertEquals(linkedList.get(1), 3);
    }

    @Test
    public void testAddAtHead() {
        linkedList.addAtHead(0);
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtHead(4);
        assertEquals(linkedList.get(0), 4);
        assertEquals(linkedList.get(1), 0);
        assertEquals(linkedList.get(2), 2);
        assertEquals(linkedList.get(3), 3);
    }

    @Test
    public void addAtIndex() {
        linkedList.addAtHead(0);
        linkedList.addAtTail(1);
        linkedList.addAtIndex(1, 2);
        assertEquals(linkedList.get(0), 0);
        assertEquals(linkedList.get(1), 2);
        assertEquals(linkedList.get(2), 1);
    }

    @Test
    public void addMultipleElementsAtIndex() {
        linkedList.addAtHead(0);
        linkedList.addAtTail(5);
        linkedList.addAtTail(6);
        linkedList.addAtTail(7);
        linkedList.addAtIndex(1, 1);
        linkedList.addAtIndex(1, 2);
        linkedList.addAtIndex(1, 3);
        linkedList.addAtIndex(1, 4);

        assertEquals(linkedList.get(0), 0);
        assertEquals(linkedList.get(1), 4);
        assertEquals(linkedList.get(2), 3);
        assertEquals(linkedList.get(3), 2);
        assertEquals(linkedList.get(4), 1);
        assertEquals(linkedList.get(5), 5);
        assertEquals(linkedList.get(6), 6);
        assertEquals(linkedList.get(7), 7);
    }

    @Test
    public void deleteNodeAtIndex() {
        linkedList.addAtHead(0);
        linkedList.addAtTail(5);
        linkedList.addAtTail(6);
        linkedList.addAtTail(7);
        linkedList.addAtIndex(1, 1);
        linkedList.addAtIndex(1, 2);
        linkedList.addAtIndex(1, 3);
        linkedList.addAtIndex(1, 4);
        linkedList.deleteAtIndex(1);

        assertEquals(linkedList.get(1), 3);

    }
}
