/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankdemo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author servi
 */
public class CheckingAccountTest {
        
        public CheckingAccountTest() {
        }

        /**
         * Test of deposit method, of class CheckingAccount.
         */
        @Test
        public void testDeposit() {
                System.out.println("deposit");
                double depositAmount = 0.0;
                CheckingAccount instance = new CheckingAccount();
                instance.deposit(depositAmount);
                // TODO review the generated test code and remove the default call to fail.
                //fail("The test case is a prototype.");
        }

        /**
         * Test of withdraw method, of class CheckingAccount.
         */
        @Test
        public void testWithdraw() throws Exception {
                System.out.println("withdraw");
                double amount = 0.0;
                CheckingAccount instance = new CheckingAccount();
                instance.withdraw(amount);
                // TODO review the generated test code and remove the default call to fail.
                //fail("The test case is a prototype.");
        }

        
        
}
