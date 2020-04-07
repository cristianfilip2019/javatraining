/*
 * Test Throw keyword
 */
package javaExceptions;

/**
 * Test Throw keyword
 * @author servi
 */
public class ThrowKeywordDemo {
    public static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Acces denied - You must be at least 18 years old");            
        }
        else{
            System.out.println("Acces granted - You are old enough");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
    
}
