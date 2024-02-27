package uvg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class FileManager {

    private File file;

    public FileManager(String fileName){
        file = new File(fileName);
    }

    public FileManager(File file){
        this.file = file;
    }

    /** 
    * @return Vector<String>
    * @throws FileNotFoundException
    * @description Leer cada línea del archivo de texto
    */
    public String readFileAsString() throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine());
            content.append("\n"); // Append a newline to separate lines
        }

        scanner.close();
        return content.toString();
    }
     /** 
     * @return Vector<String>
     * @throws FileNotFoundException
     * @description IMPORTANTE: método que además de leer el archivo, elimina las líneas que contengan valores no numéricos o dentro de los signos aceptados (+, -, / ,*)
     */
    public Vector<String> readLines() throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        Vector<String> content = new Vector<String>();
    
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.matches("^[0-9]+$")) {
                content.add(line);
            }
        }

          scan.close();

          return content;
     }
     
}
