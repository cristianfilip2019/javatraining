/*
 * Test to show exception thrown, how the runTime system searches
 * the call stack to find appropiate exception handler.
 */
package javaexceptions3;

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
        int a = 10;
        int b = 2;
        try{
            int i = divideByZero(a, b);
            System.out.println("i = " + i);
            
            int j = computeDivision(a, 0);            
            System.out.println("j = " + j);
        } 
                //matching ArithmeticException
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
