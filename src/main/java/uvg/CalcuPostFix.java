package uvg;

public class CalcuPostFix {
     private static CalcuPostFix single_instance = null;

     public String sss;

     public static synchronized CalcuPostFix getInstance()
     {
          if (single_instance == null){
               single_instance = new CalcuPostFix();
          }return single_instance;
     }

     public int calcPostFix(String str, String stackType, String listType) {
          UVGStack<Integer> numbers = IntegerStackFactory.create(stackType, listType);
          String[] array = str.split("");
          int a;
          int b;

          for (String element : array) {
               switch (element) {
                    case "+":
                    if (!numbers.isEmpty()) {
                         int primerNumero = numbers.pop();
                         boolean estaVacio = numbers.isEmpty();
                         numbers.push(primerNumero);

                         if (estaVacio) {
                              System.out.println("El Stack debe contener al menos 2 numeros.");
                         }
                    } else {
                         System.out.println("El Stack debe contener al menos 2 numeros.");
                    } {
                    a = numbers.pop();
                    b = numbers.pop();
                    numbers.push(b + a);
                    }
                    break;

                    case "-":
                    if (!numbers.isEmpty()) {
                         int primerNumero = numbers.pop();
                         boolean estaVacio = numbers.isEmpty();
                         numbers.push(primerNumero);

                         if (estaVacio) {
                              System.out.println("El Stack debe contener al menos 2 numeros.");
                         }
                    } else {
                         System.out.println("El Stack debe contener al menos 2 numeros.");
                    } {
                    a = numbers.pop();
                    b = numbers.pop();
                    numbers.push(b - a);
                    }
                    break;

                    case "*":
                    if (!numbers.isEmpty()) {
                         int primerNumero = numbers.pop();
                         boolean estaVacio = numbers.isEmpty();
                         numbers.push(primerNumero);

                         if (estaVacio) {
                              System.out.println("El Stack debe contener al menos 2 numeros.");
                         }
                    } else {
                         System.out.println("El Stack debe contener al menos 2 numeros.");
                    } {
                    a = numbers.pop();
                    b = numbers.pop();
                    numbers.push(b * a);
                    }

                    break;
                    case "/":
                    if (!numbers.isEmpty()) {
                         int primerNumero = numbers.pop();
                         boolean estaVacio = numbers.isEmpty();
                         numbers.push(primerNumero);

                         if (estaVacio) {
                              System.out.println("El Stack debe contener al menos 2 numeros.");
                         }
                    } else {
                         System.out.println("El Stack debe contener al menos 2 numeros.");
                    } {
                    a = numbers.pop();
                    b = numbers.pop();
                    if (a != 0) {
                         numbers.push(b / a);
                    } else {
                         System.out.println("No se puede dividir por 0 en: " + b + "/" + a);
                    }
                    }
                    break;
                    default:
                    numbers.push(Integer.parseInt(element));
               }
          }
          return numbers.isEmpty() ? 0 : numbers.pop(); 
     }
}



     

