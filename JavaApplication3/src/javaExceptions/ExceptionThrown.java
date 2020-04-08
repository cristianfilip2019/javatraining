/*
 * Test to show exception thrown, how the runTime system searches
 * the call stack to find appropiate exception handler.
 */
package javaExceptions;

/**
 * Test to show exception thrown
 * @author servi
 */
public class ExceptionThrown {
                // it throws the Exception(ArithmeticException). Appropiate Exception handler is not found within this method
    public static int divideByZero(int a, int b){
                //this statement will cause ArithmeticException(/by zero)
        int i = a/b;
        return i;
    }
                //the runtime system searches the appropiate exception handler, in this method also but couldn't have found. So looking forward 
                //on the call stack.
    public static int computeDivision(int a, int b){
        int res = 0;
        try{
            res = divideByZero(a, b);
        }
                //doesn't matches with ArithmeticException
        catch(NumberFormatException ex){
            System.out.println("NumerFormatException is occured");
        }
        return res;
    }
                //in this method found appropiate exception handler. matching catch block
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try{
            int i = computeDivision(a, b);
            int j = divideByZero(1, 0);
        } 
                //matching ArithmeticException
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
