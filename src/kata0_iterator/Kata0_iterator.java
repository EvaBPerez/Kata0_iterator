package kata0_iterator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Kata0_iterator {

    public static void main(String[] args) {
        String fileName = new String("archive.txt");
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            
            IteratorReader iteratorReader = new IteratorReader(reader);
            for (String line : iteratorReader) {
                System.out.println(line);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR Kata0_iteratir::main (File not Found)" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("ERROR Kata0_iteratir::main (IO)" + ex.getMessage());
        }
        
    }
    
}
