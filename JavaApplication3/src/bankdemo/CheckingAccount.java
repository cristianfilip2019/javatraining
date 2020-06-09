/*
        public class CheckingAccount
        includes 2 attributes
        includes 3 methods
 */
package bankdemo;

public class CheckingAccount {

        private double balance;//used to store the account balance
        public int depositAmount;//used to store how much is going to be added to the account
        //deposit() method adds to the value of balance variable the value of parameter of type double depositAmount
        public void deposit(double depositAmount) {
                balance += depositAmount;
        }
        //withdraw() method decreases the value of the balance variable with the value of parameter of type double amount
        //withdraw() throws exception dealt with in public class InsufficientFundsException
        public void withdraw(double amount) throws InsufficientFundsException {
                //condition to confirm that there is enough money to withdraw in the balance 
                if (amount <= balance) {
                        balance -= amount;
                } else {
                        // if there is not enough money in the balance to withdraw the function passes the variable needs(amount needed) to InsufficientFundsException
                        double needs = amount - balance;  
                        throw new InsufficientFundsException(needs);
                }
        }
        // getter method for accesing the value of private balance variable
        public double getBalance() {
                return balance;
        }

}
