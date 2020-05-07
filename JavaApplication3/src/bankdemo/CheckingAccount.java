/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankdemo;

/**
 *
 * @author servi
 */
public class CheckingAccount {
        private double balance;
        
        public int depositAmount;
        
          
        public void deposit(double depositAmount){
                balance += depositAmount;
        }    
        public void withdraw(double amount) throws InsufficientFundsException{
                if(amount <= balance){
                balance-=amount;
                } else{
                        double needs = amount - balance;
                        throw new InsufficientFundsException(needs);    
                }
        }
        public double getBalance() {
                return balance;
        }
        
}
