package ImplementQueueUsingLinkedListTest;

import ProgrammingCreek.ImplementQueueUsingLinkedList.ImplementQueueUsingLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImplementQueueUsingLinkedListTest {
    ImplementQueueUsingLinkedList queue;
    @Before
    public void setup(){
        queue = new ImplementQueueUsingLinkedList();
    }
    @Test
    public void testEnqueueInEmptyQueue(){
        assertEquals(queue.enqueue(1),true);
    }

    @Test
    public void testEnqueueInQueue(){
        assertEquals(queue.enqueue(1),true);
        assertEquals(queue.enqueue(2),true);
        assertEquals(queue.enqueue(3),true);
    }

    @Test
    public void testDequeueInQueue(){
        assertEquals(queue.enqueue(1),true);
        assertEquals(queue.enqueue(2),true);
        assertEquals(queue.enqueue(3),true);
        assertEquals(queue.dequeue(),1);
        assertEquals(queue.dequeue(),2);
        assertEquals(queue.dequeue(),3);
        assertEquals(queue.dequeue(),-1);
    }


}
