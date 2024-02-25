package uvg;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class IntergerStackFactory {
    
    @Test
    public void VectorStackTest(){
        UVGStack<Integer> vectorStack = IntegerStackFactory.create("Vector");

        assertTrue(vectorStack instanceof VectorStack);
        assertFalse(vectorStack instanceof ArrayListStack);
        assertFalse(vectorStack instanceof LinkedListStack);
    }

    @Test
    public void ArrayListStackTest(){
        UVGStack<Integer> arraylistStack = IntegerStackFactory.create("ArrayList");

        assertFalse(arraylistStack instanceof VectorStack);
        assertTrue(arraylistStack instanceof ArrayListStack);
        assertFalse(arraylistStack instanceof LinkedListStack);
    }


    @Test
    public void SimpleLinkedListStackTest(){
        UVGStack<Integer> simpleStack = IntegerStackFactory.create("List", "Single");

        assertFalse(simpleStack instanceof VectorStack);
        assertFalse(simpleStack instanceof ArrayListStack);
        assertTrue(simpleStack instanceof LinkedListStack);
    }

    @Test
    public void DoubleLinkedListStackTest(){
        UVGStack<Integer> doubleStack = IntegerStackFactory.create("List", "Single");

        assertFalse(doubleStack instanceof VectorStack);
        assertFalse(doubleStack instanceof ArrayListStack);
        assertTrue(doubleStack instanceof LinkedListStack);
    }

}
