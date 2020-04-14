/*
 * Test read from file
 */
package javaexceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * Test read from file
 * @author servi
 */
public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        File file = new File("F:\\OneDrive\\desktop\\readfile1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) !=null){
            System.out.println(st);
        }  
    }
}
