package uvg;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.io.*;
import java.util.Vector;

public class App {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        FileManager leer = new FileManager("src/main/FileNum.txt");
        

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
                        Vector<String> lineas = leer.readLines();
                        for (String linea : lineas){
                            //UVGStack<Integer> stk = UVGStack('List', stk);
                        }
                    } catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                } else if (factor == 2) {
                    System.out.println("Usando Single");
                    try {
                        Vector<String> lineas = leer.readLines();
                        for (String linea : lineas){
                            //UVGStack<Integer> stk = UVGStack('List', stk);
                        }
                    } catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }
                break;

            case 2:
                System.out.println("Usando Vector");
                try {
                    Vector<String> lineas = leer.readLines();
                    for (String linea : lineas){
                        //UVGStack<Integer> stk = UVGStack('Vector', stk);
                    }
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                break;

            case 3:
                System.out.println("Usando ArrayList");
                try {
                    Vector<String> lineas = leer.readLines();
                    for (String linea : lineas){
                        //UVGStack<Integer> stk = UVGStack('Vector', stk);
                    }
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                break;

            default:
                System.out.println("CHAO");
                break;
        }

    }
}
