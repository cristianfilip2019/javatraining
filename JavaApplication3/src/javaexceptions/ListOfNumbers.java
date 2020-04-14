
package javaexceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private final List<Integer> list;
    private static final int SIZE = 10;  
    
    public ListOfNumbers(){
        list = new ArrayList<>(SIZE);
        for(int i = 0; i < SIZE; i++){
            list.add(i);
        }
    }    

    public void makeFile() throws IOException{
        BufferedWriter out = new BufferedWriter(new FileWriter("F:\\OneDrive\\desktop\\Outfile.txt"));
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
    
    public static void main(String[] args) throws IOException{
        ListOfNumbers createList = new ListOfNumbers();
        createList.writeList();
        createList.makeFile();
    }
}
