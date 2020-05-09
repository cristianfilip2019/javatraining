
package countdown;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountdownTest {
        
        public CountdownTest() {
        }

        /**
         * Test of countDown method, of class Countdown.
         */
        @Test
        public void testCountDown() throws Exception {
                System.out.println("countDown");
                Countdown instance = new Countdown();
                instance.countDown();
                // TODO review the generated test code and remove the default call to fail.
                //fail("The test case is a prototype.");
        }
        
}
