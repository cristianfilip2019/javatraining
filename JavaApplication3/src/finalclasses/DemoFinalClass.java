/*
 * Demo final class
 */
package finalclasses;

/**
 * Demo final class
 * @author servi
 */
public class DemoFinalClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrozenClass froz = new FrozenClass();
        boolean answer = froz.checkValidityKey("48s4sd");
        System.out.println("Key is valid: " + answer);
                
    }
    
}
