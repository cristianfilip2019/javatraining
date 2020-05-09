/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexceptions7;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author servi
 */
public class CheckAgeTest {
        
        public CheckAgeTest() {
        }

        /**
         * Test of checkingAge method, of class CheckAge.
         */
        @Test
        public void testCheckingAge() {
                System.out.println("checkingAge");
                int age = 20;
                CheckAge.checkingAge(age);
                // TODO review the generated test code and remove the default call to fail.
                //fail("The test case is a prototype.");
        }
        
}
