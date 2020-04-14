/*
 * Exception example
 */
package javaexceptions;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Exception example
 * @author servi
 */
public class ExceptionExample {

    public static void main(String[] args) throws IOException{
        FileInputStream inputFile = new FileInputStream("F:\\OneDrive\\desktop\\readfile.txt");
        int k;
        while ((k = inputFile.read()) != -1){
            System.out.println((char)k);
        }
        inputFile.close();
    }
    
}
