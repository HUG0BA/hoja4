package uvg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListStackTest {
    
    @Test
    public void testSinglePush(){
        UVGStack<Integer> singleStack = new LinkedListStack<Integer>("Single");

        singleStack.push(1);
        assertFalse(singleStack.isEmpty());
    }

    @Test
    public void testSingleStackTop(){
        UVGStack<Integer> stack = new LinkedListStack<Integer>("Single");

        stack.push(1);
        int top = stack.top();
        assertEquals(1, top);

        stack.push(2);
        top = stack.top();
        assertEquals(2, top);

        stack.push(3);
        stack.push(4);
        stack.push(5);
        top = stack.top();
        assertEquals(5, top);
        
    }

    @Test
    public void testSingleStackPop(){
        UVGStack<Integer> stack = new LinkedListStack<Integer>("Single");

        stack.push(1);
        int pop = stack.pop();
        assertEquals(1, pop);

        stack.push(2);
        pop = stack.pop();
        assertEquals(2, pop);

        stack.push(3);
        stack.push(4);
        stack.push(5);
        pop = stack.top();
        assertEquals(5, pop);
    }

    @Test 
    public void testSingleIsEmpty(){

        UVGStack<Integer> stack = new LinkedListStack<Integer>("Single");

        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());
        
        stack.top();
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSingleBehavior(){
        UVGStack<Integer> stack = new LinkedListStack<Integer>("Single");

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        int top = stack.top();
        assertEquals(6, top);

        int pop = stack.pop();
        top = stack.top();
        assertEquals(6, pop);
        assertEquals(5, top);

        pop = stack.pop();
        assertEquals(5, pop);
        pop = stack.pop();
        assertEquals(4, pop);
        pop = stack.pop();
        assertEquals(3, pop);

        top = stack.top();
        assertEquals(2, top);

        stack.push(7);
        
        top = stack.top();
        assertEquals(7, top);

        pop = stack.pop();
        top = stack.top();
        assertEquals(7, pop);
        assertEquals(2, top);
    }

    @Test
    public void testDoublePush(){
        UVGStack<Integer> singleStack = new LinkedListStack<Integer>("Double");

        singleStack.push(1);
        assertFalse(singleStack.isEmpty());
    }

    @Test
    public void testDoubleStackTop(){
        UVGStack<Integer> stack = new LinkedListStack<Integer>("Double");

        stack.push(1);
        int top = stack.top();
        assertEquals(1, top);

        stack.push(2);
        top = stack.top();
        assertEquals(2, top);

        stack.push(3);
        stack.push(4);
        stack.push(5);
        top = stack.top();
        assertEquals(5, top);
        
    }

    @Test
    public void testDoubleStackPop(){
        UVGStack<Integer> stack = new LinkedListStack<Integer>("Double");

        stack.push(1);
        int pop = stack.pop();
        assertEquals(1, pop);

        stack.push(2);
        pop = stack.pop();
        assertEquals(2, pop);

        stack.push(3);
        stack.push(4);
        stack.push(5);
        pop = stack.top();
        assertEquals(5, pop);
    }

    @Test 
    public void testDoubleIsEmpty(){

        UVGStack<Integer> stack = new LinkedListStack<Integer>("Double");

        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());
        
        stack.top();
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testDoubleBehavior(){
        UVGStack<Integer> stack = new LinkedListStack<Integer>("Double");

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        int top = stack.top();
        assertEquals(6, top);

        int pop = stack.pop();
        top = stack.top();
        assertEquals(6, pop);
        assertEquals(5, top);

        pop = stack.pop();
        assertEquals(5, pop);
        pop = stack.pop();
        assertEquals(4, pop);
        pop = stack.pop();
        assertEquals(3, pop);

        top = stack.top();
        assertEquals(2, top);

        stack.push(7);
        
        top = stack.top();
        assertEquals(7, top);

        pop = stack.pop();
        top = stack.top();
        assertEquals(7, pop);
        assertEquals(2, top);
    }
 
}
