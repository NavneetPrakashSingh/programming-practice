package ProgrammingCreek.ImplementStackUsingLinkedListTest;

import ProgrammingCreek.ImplementStackUsingLinkedList.ImplementStackUsingLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImplementStackUsingLinkedListTest {
    ImplementStackUsingLinkedList stack;
    @Before
    public void setup(){
        stack = new ImplementStackUsingLinkedList();
    }

    @Test
    public void testPopForUnderflow(){
        assertEquals(stack.pop(),-1);
    }

    @Test
    public void testPopForValidCase(){
        assertEquals(stack.push(1),true);
    }

    @Test
    public void testPushAndPop(){
        assertEquals(stack.pop(),-1);
        assertEquals(stack.push(1),true);
        assertEquals(stack.push(2),true);
        assertEquals(stack.push(3),true);
        assertEquals(stack.get(1),2);
        assertEquals(stack.pop(),3);
        assertEquals(stack.pop(),2);
        assertEquals(stack.get(2),-1);
        assertEquals(stack.get(0),1);
    }

}
