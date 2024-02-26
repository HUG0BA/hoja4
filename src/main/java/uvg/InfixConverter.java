package uvg;

import java.util.*;

public class InfixConverter{
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
          StringBuilder strAns = new StringBuilder();


          for (char a : str.toCharArray()) {
               if (Character.isDigit(a)) {
                    strAns.append(a);
               } else if (a == '(') {
                    stk.push(a);
               } else if (a == ')') {
                    while (!stk.isEmpty() && stk.peek() != '(') {
                         strAns.append(stk.pop());
                    }
                    if (!stk.isEmpty()) {
                         stk.pop();
                    }
               } else {
                    while (!stk.isEmpty() && preference(stk.peek()) >= preference(a)) {
                         stk.pop();
                    }
                    stk.push(a);
               }
          }
          while (!stk.isEmpty()) {
               strAns.append(stk.pop());
          }

          return strAns.toString();
     }
}
