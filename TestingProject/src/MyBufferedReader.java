
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Understand buffered reader
 */

/**
 * Understand buffered reader
 * @author servi
 */
public class MyBufferedReader {

        public static void main(String[] args) throws FileNotFoundException, IOException {
                String txtFile = "F:\\OneDrive\\desktop\\readfile.txt";
                try {
                        File file= new File(txtFile);
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
                        String line = br.readLine();
                        System.out.println(line);
                        
                        //int i;
                        //while((i = br.read())!=-1){
                           //     System.out.print((char)i);
                        //}
                        //br.close();
                }
                catch(IOException e){
                        
                }
                
        }
        
}
