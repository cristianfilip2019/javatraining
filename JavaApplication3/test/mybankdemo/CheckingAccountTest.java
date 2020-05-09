
package mybankdemo;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckingAccountTest {
        
        public CheckingAccountTest() {
        }

        /**
         * Test of operations method, of class CheckingAccount.
         */
        @Test
        public void testOperations() {
                System.out.println("operations");
                CheckingAccount instance = new CheckingAccount();
                instance.operations();
                // TODO review the generated test code and remove the default call to fail.
                //fail("The test case is a prototype.");
        }       
}
