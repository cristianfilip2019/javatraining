
package javaexceptions4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
        private final List<Integer> list;
        private static final int SIZE = 20;  
    
        public ListOfNumbers(){
                list = new ArrayList<>(SIZE);
                for(int i = 0; i < SIZE; i++){
                        list.add(i);
                }
        }
        
        public void makeFile() throws IOException{
        BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\servi\\Documents"
                + "\\NetBeansProjects\\javatraining\\JavaApplication3\\src\\javaexceptions4\\Outfile.txt"));
        String outfile = list.toString();
        outfile = outfile.substring(1, outfile.length()-1);
        out.write(outfile);
        out.close();        
        }
        
        public void writeList() { 
        //try{ 
            for (int i = 0; i < SIZE; i++){
                System.out.println("Value at : " + i + " = " + list.get(i));
            }
        /*} catch (IndexOutOfBoundsException e){
                System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }*/
    }
}
