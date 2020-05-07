/*
 * Csv reader
 */
package csvreadertest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Csv reader
 * @author servi
 */
public class CsvReader {
        public static final String DELIMITER = ",";
        
        public static void read(String csvFile){
                try{
                        File file = new File(csvFile);
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
                        String line;
                        String[] tempArr;
                        String headerLine = br.readLine();
                        while((line = br.readLine()) != null){
                                String[] split = line.split(",");
                                if(split[7].equals("HTML") || split[7].equals("Ebook") || split[7].equals("PDF") || split[7].equals("WORD")){
                                        tempArr = line.split(DELIMITER);
                                        for(String tempStr : tempArr) {
                                                System.out.print(tempStr + "  ");
                                        }
                                        System.out.println();
                                }
                        }
                        br.close();
                }
                catch(IOException ioe){
                        ioe.printStackTrace();
                }
        }
}
