
package javaexceptions4;

import org.junit.Test;
import static org.junit.Assert.*;

public class ListOfNumbersTest {
        
        public ListOfNumbersTest() {
        }

        /**
         * Test of makeFile method, of class ListOfNumbers.
         */
        @Test
        public void testMakeFile() throws Exception {
                System.out.println("makeFile");
                ListOfNumbers instance = new ListOfNumbers();
                instance.makeFile();
                // TODO review the generated test code and remove the default call to fail.
                //fail("The test case is a prototype.");
        }

        /**
         * Test of writeList method, of class ListOfNumbers.
         */
        @Test
        public void testWriteList() {
                System.out.println("writeList");
                ListOfNumbers instance = new ListOfNumbers();
                instance.writeList();
                // TODO review the generated test code and remove the default call to fail.
                //fail("The test case is a prototype.");
        }
        
}
