package uvg;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.io.*;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        FileManager leer = new FileManager();
        CalcuPostFix calc = new CalcuPostFix();
      

        System.out.println("Bienvenido a la calculadora de Infix a PostFix");
        System.out.println("Con que tipo de StackFactory quiere manipular su texto? ");
        System.out.println("1. Factory");
        System.out.println("2. Vector");
        System.out.println("3. ArrayList");
        System.out.println("Salir");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Tipo de Lista desea usar");
                System.out.println("1. Double");
                System.out.println("2. Single");
                int factor = teclado.nextInt();
                if (factor == 1) {
                    System.out.println("Usando Double");
                    try {
                        ArrayList<String> lineas = leer.readTXTFile("/FileNum.txt");
                        for (int i = 0; i<lineas.size(); i++){
                            String e = InfixConverter.InfixToPostfix(lineas.get(i));
                            int a = calc.calcPostFix(e, "List", "Double");
                            System.out.println(a);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                        System.out.println(e);
                    }

                } else if (factor == 2) {
                    System.out.println("Usando Single");
                    try {
                        ArrayList<String> lineas = leer.readTXTFile("/FileNum.txt");
                        for (int i = 0; i<lineas.size(); i++){
                            String e = InfixConverter.InfixToPostfix(lineas.get(i));
                            int a = calc.calcPostFix(e, "List", "Single");
                            System.out.println(a);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                        System.out.println(e);
                    }

                }
                break;

            case 2:
                System.out.println("Usando Vector");
                try {
                    ArrayList<String> lineas = leer.readTXTFile("/FileNum.txt");
                    for (int i = 0; i<lineas.size(); i++){
                        String e = InfixConverter.InfixToPostfix(lineas.get(i));
                        int a = calc.calcPostFix(e, "Vector", "");
                        System.out.println(a);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.out.println(e);
                }

                break;

            case 3:
                System.out.println("Usando ArrayList");
                try {
                    ArrayList<String> lineas = leer.readTXTFile("/FileNum.txt");
                    for (int i = 0; i<lineas.size(); i++){
                        String e = InfixConverter.InfixToPostfix(lineas.get(i));
                        int a = calc.calcPostFix(e, "ArrayList", "");
                        System.out.println(a);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.out.println(e);
                }

                break;

            default:
                System.out.println("CHAO");
                break;
        }

    }
}
