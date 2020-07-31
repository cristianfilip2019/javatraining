
package classforjunit;

import org.junit.Test;
import static org.junit.Assert.*;

public class ForJUnitTest {
        
        public ForJUnitTest() {
        }

        /**
         * Test of sum method, of class ForJUnit.
         */
        @Test
        public void testSum() {
                System.out.println("sum");
                int a = -1;
                int b = -2;
                ForJUnit instance = new ForJUnit();
                int expResult = -3;
                int result = instance.sum(a, b);
                assertEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
               //fail("The test case is a prototype.");
        }
        
}
