
package javaexceptions7;

public class CheckAge {
        public static void checkingAge(int age){
        if(age<18){
            throw new ArithmeticException("Acces denied - You must be at least 18 years old");            
        }
        else{
            System.out.println("Acces granted - You are old enough");
        }
    }
}
