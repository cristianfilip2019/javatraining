/*
 * Testing TryCatch exceptions 
 */
package javaExceptions;

/**
 * Testing TryCatch exceptions 
 * @author servi
 */
public class TryCatchClass {

    public static void main(String[] args) {
        try {
            int[] someNumbers = {1, 2, 3};
            System.out.println(someNumbers[2]);
        } catch(Exception e){
            System.out.println("Somethig went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
    
}
