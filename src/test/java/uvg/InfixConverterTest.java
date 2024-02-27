package uvg;

import static org.junit.Assert.*;

import org.junit.Test;

public class InfixConverterTest {
     @Test
     public void TestInfixToPostfix() {
          String TestArray = "1+2(4*3)";
          String AnsArray = "1243*+";

          String test1 = "1+2*9";
          String ans1 = "129*+";

          String test2 = "(1+2)*9";
          String ans2 = "12+9*";

          assertEquals(AnsArray, InfixConverter.InfixToPostfix(TestArray));
          assertEquals(ans1, InfixConverter.InfixToPostfix(test1));
          assertEquals(ans2, InfixConverter.InfixToPostfix(test2));
     }
}
