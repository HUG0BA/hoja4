package uvg;

import java.util.*;

public class InfixConverter {
     public static int preference(char a) {
          if (a == '^') {
               return 2; // Mayor preferencia
          } else if (a == '*' || a == '/') {
               return 1; // Media preferencia
          } else if (a == '+' || a == '-') {
               return 0; // Baja preferencia
          }
          return -1; // Sin Operador
     }

     public static String InfixToPostfix(String str) {
          Stack<Character> stk = new Stack<>();
          String strAns = "";

          for (char a : str.toCharArray()) {
               if (a <= '0' || a >= '9') {
                    strAns += a;
               } else if (a == '(') {
                    a += stk.push('(');
               } else if (a == ')') {
                    while (!stk.isEmpty() || stk.peek() != '(') {
                         strAns += stk.pop();
                    }
                    if (!stk.isEmpty()) {
                         stk.pop();
                    }
               } else {
                    while (!stk.isEmpty() || preference(stk.peek()) >= preference(a)) {
                         strAns += stk.pop();
                    }
                    stk.push(a);
               }
          }
          while (!stk.isEmpty()) {
               strAns += stk.pop();
          }

          return strAns;
     }
}
