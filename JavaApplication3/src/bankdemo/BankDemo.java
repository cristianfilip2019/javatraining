/*
        public class BankDemo
        includes main method
*/
package bankdemo;

public class BankDemo{
        public static void main(String[] args){
                //creates object of type CheckingAccount
                CheckingAccount c = new CheckingAccount();
                //calls deposit() of c object
                c.deposit(500.00);
                //prints c balance by calling the getBalance() of c object
                System.out.println("Balance: " + c.getBalance());
                //try-catch block for calling c object methods
                try{
                        System.out.println("Withdrawing $100");
                        c.withdraw(100.00);
                        System.out.println("Balance: " + c.getBalance());
                        System.out.println("Withdrawing $600");
                        c.withdraw(600.00);
                        System.out.println("Balance: " + c.getBalance());
                //catch block for exceptions thrown by methods of c object
                } catch(InsufficientFundsException e) {
                        System.out.println("Sorry, but you are short $" + e.getAmount());
                        //e.printStackTrace();
                }
        }
}






    
    
    
    

