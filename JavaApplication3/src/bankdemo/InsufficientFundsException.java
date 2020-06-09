/*
        public class InsufficientFundsException
        includes 1 attribute
        includes 1 explicit constructor
 */
package bankdemo;

public class InsufficientFundsException extends Exception{
        private double amount; //stores the amount missing in the balance variable of class CheckingAccount
        //explicit constructor of this class, sets the amount missing in the balance variable of class CheckingAccount
        public InsufficientFundsException(double amount){
                this.amount=amount;
        }
        //getter to acces the value of private variable amount
        public double getAmount(){
                return amount;
        }
}
