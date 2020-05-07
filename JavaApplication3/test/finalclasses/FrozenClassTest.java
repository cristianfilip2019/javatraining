/*
 * Frozen class test
 */
package finalclasses;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Frozen class test
 * @author servi
 */
public class FrozenClassTest {
        
        public FrozenClassTest() {
        }

        /**
         * Test of checkValidityKey method, of class FrozenClass.
         */
        @Test
        public void testCheckValidityKey() {
                System.out.println("checkValidityKey");
                String key = "56165";
                FrozenClass instance = new FrozenClass();
                boolean expResult = false;
                boolean result = instance.checkValidityKey(key);
                assertEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
                //fail("The test case is a prototype.");
        }
        
}
