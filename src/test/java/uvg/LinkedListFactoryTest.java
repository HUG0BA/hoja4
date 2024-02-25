package uvg;

import static org.junit.Assert.*;

import org.junit.Test;


public class LinkedListFactoryTest {
    
    @Test
    public void SingleListTest(){
        LinkedListFactory<String> linkedListFactory = new LinkedListFactory<>();
        UVGList<String> sLList =linkedListFactory.create("Single");

        assertTrue(sLList instanceof SLList);
        assertFalse(sLList instanceof DLList);
    }

    @Test
    public void DoubleListTest(){
        LinkedListFactory<String> linkedListFactory = new LinkedListFactory<>();
        UVGList<String> dLList =linkedListFactory.create("Double");

        assertTrue(dLList instanceof DLList);
        assertFalse(dLList instanceof SLList);
    }
}
