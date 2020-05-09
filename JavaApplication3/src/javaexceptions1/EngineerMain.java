/*
 * Test class engineer
 */
package javaexceptions1;

import java.util.Scanner;

/**
 * Test class engineer
 * @author servi
 */
public class EngineerMain {
    
    public static void main(String[] args) {        
        System.out.println("Age of engineer: ");        
        Scanner inputAge = new Scanner(System.in);        
        int engAge = inputAge.nextInt();       
        try{
            Engineer newEng = new Engineer();
            newEng.setAge(engAge);           
        } catch(IllegalArgumentException ex){
            System.err.println(ex);            
        }
    }    
}
