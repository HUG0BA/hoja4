package uvg;

import static org.junit.Assert.assertEquals;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class FileManagerTest {

     @Test
     public void readLines() throws FileNotFoundException, IOException {
          FileManager a = new FileManager();

          ArrayList<String> L = a.readTXTFile("/FileNum.txt");
          for (int i = 0; i<L.size() ; i++){
               assertEquals("1+2(4*3)", L.get(i));
          }
          
     }
     
}
