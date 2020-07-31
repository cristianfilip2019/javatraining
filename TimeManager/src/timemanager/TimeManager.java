/*
 * Time manager
 */
package timemanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

/**
 * Time manager
 * @author servi
 */
public class TimeManager {
        public static final String DELIMITER = ",";

        public static void main(String[] args) throws ParseException {
                String csvFile ="C:\\Users\\servi\\Documents\\NetBeansProjects\\javatraining\\TimeManager\\src\\timemanager\\TimeManager.csv";
                try{
                        File file = new File(csvFile);
                        FileReader fr = new FileReader(file);
                        try(BufferedReader br = new BufferedReader(fr)) {                                
                                String line;
                                String[] tempArr;
                                String headerLine = br.readLine();
                                while((line = br.readLine()) != null){
                                        String[] split = line.split(",");
                                        tempArr = line.split(DELIMITER);
                                        Events event = new Events(tempArr[0], tempArr[1], tempArr[2], tempArr[3], tempArr[4], tempArr[5]);
                                        System.out.println("Date: " + event.getData() + "\n" +
                                                "Ora: " + event.getOra() + "\n" +
                                                "Duration: " + event.getDuration() + "\n" +
                                                "Nume activitate: " + event.getNumeActivitate() + "\n" +
                                                "Nume subactivitate: " + event.getNumeSubActivitate() + "\n" +
                                                "Descriere subactivitate: " + event.getDescriereActivitate());
                                        System.out.println();
                                }
                        }
                        
                }
                catch(IOException ioe){
                        System.out.println("The file doesn't exist!");
                }
        }       
}
