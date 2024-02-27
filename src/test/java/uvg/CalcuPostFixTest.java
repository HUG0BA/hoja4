package uvg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcuPostFixTest {
         @Test
    public void calcPostFix(){
        CalcuPostFix calcu = new CalcuPostFix();

        assertEquals(15, calcu.calcPostFix("1 2 + 4 * 3 +", "Vector", ""));
        assertEquals(15, calcu.calcPostFix("1 2 + 4 * 3 +", "ArrayList", ""));
        assertEquals(15, calcu.calcPostFix("1 2 + 4 * 3 +", "List", "Single"));
        assertEquals(15, calcu.calcPostFix("1 2 + 4 * 3 +", "List", "Double"));
     }
}
