package uvg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArrayListStackTest {
    
    @Test
    public void testPush(){
        UVGStack<Integer> stack = new ArrayListStack<Integer>();

        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testStackTop(){
        UVGStack<Integer> stack = new ArrayListStack<Integer>();

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
    public void testStackPop(){
        UVGStack<Integer> stack = new ArrayListStack<Integer>();

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
    public void testIsEmpty(){

        UVGStack<Integer> stack = new ArrayListStack<Integer>();

        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());
        
        stack.top();
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testBehavior(){
        UVGStack<Integer> stack = new ArrayListStack<Integer>();

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
