/*
 * Test read from file
 */
package javaexceptions5;

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
        File file = new File("C:\\Users\\servi\\Documents\\NetBeansProjects\\javatraining\\JavaApplication3"
                + "\\src\\javaexceptions5\\readfile.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) !=null){
            System.out.println(st);
        }  
    }
}
