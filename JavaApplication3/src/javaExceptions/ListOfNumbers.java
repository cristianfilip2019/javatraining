
package javaExceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    public void writeList() {
        PrintWriter out = null;
        try{ 
            out = new PrintWriter(new FileWriter("F:\\OneDrive\\desktop\\Outfile.txt"));
            String outfile = list.toString();
            outfile = outfile.substring(1, outfile.length()-1);
            out.write(outfile);
            out.close();
            
            for (int i = 0; i < SIZE; i++){
                System.out.println("Value at : " + i + " = " + list.get(i));
            }
        } catch (IndexOutOfBoundsException e){
                System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch(IOException e){
                System.err.println("Caught IOException: " + e.getMessage());
        }
        out.close();
    }
    
    public static void main(String[] args){
        ListOfNumbers createList = new ListOfNumbers();
        createList.writeList();
    }
}
