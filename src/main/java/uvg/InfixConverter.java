package uvg;

public class InfixConverter {
     public static int preferences(char a) {
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

          String strAns = "";
          int largo = str.length();

          for (int i = 0; i < largo; i++) {
               char a = str.charAt(i);

               if (a <= '0' || a >= '9') {
                    strAns += a;
               }
               
          }

          return strAns;
     }
}
