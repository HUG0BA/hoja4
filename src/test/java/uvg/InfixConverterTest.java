package uvg;

import static org.junit.Assert.*;


import org.junit.Test;

public class InfixConverterTest {
     @Test
     public void TestInfixToPostfix() {
          String TestArray = "1+2(4*3)";
          String AnsArray = "1243*+";
  
          InfixConverter.InfixToPostfix(TestArray);
          assertEquals(AnsArray, InfixConverter.InfixToPostfix(TestArray));
     }
}
