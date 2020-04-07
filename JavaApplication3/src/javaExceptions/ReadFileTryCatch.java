
package javaExceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTryCatch {
        
    public static void main(String[] args) {
        try{
            File file = new File("F:\\OneDrive\\desktop\\readfile.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) !=null){
                System.out.println(st);
            }
        }  catch(FileNotFoundException e){
                System.out.println("Exception thrown: " + e);
        }  catch(IOException e){
                System.out.println("Exception thrown: " + e);    
        }
    } 
}
