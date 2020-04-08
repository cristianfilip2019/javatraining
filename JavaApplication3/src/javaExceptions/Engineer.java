/*
 * Test class engineer
 */
package javaExceptions;

import java.util.Scanner;

/**
 * Test class engineer
 * @author servi
 */
public class Engineer {
    protected int age;
    public void setAge(int age){
        if(age < 21 || age > 59){
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }
    public static void main(String[] args) {
        Scanner inputAge = new Scanner(System.in);
        System.out.println("Age of engineer: ");
        int engAge = inputAge.nextInt();        
        try{
            Engineer newEng = new Engineer();
            newEng.setAge(engAge);
        } catch(IllegalArgumentException ex){
            System.err.println(ex);            
        }
    }    
}
