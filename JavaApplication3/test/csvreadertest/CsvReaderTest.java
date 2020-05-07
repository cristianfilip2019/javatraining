/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvreadertest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author servi
 */
public class CsvReaderTest {
        
        public CsvReaderTest() {
        }

        /**
         * Test of read method, of class CsvReader.
         */
        @Test
        public void testRead() {
                System.out.println("read");
                String csvFile = "C:\\Users\\servi\\Documents\\NetBeansProjects\\javatraining\\"
                        + "JavaApplication3\\src\\csvreadertest\\ElectronicBookCsv.csv";
                CsvReader.read(csvFile);
                // TODO review the generated test code and remove the default call to fail.
                //fail("The test case is a prototype.");
        }
        
}
