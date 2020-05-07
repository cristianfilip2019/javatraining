
package bankdemo;

public class BankDemo{
        public static void main(String[] args){
                CheckingAccount c = new CheckingAccount();               
                c.deposit(500.00);
                System.out.println("Balance: " + c.getBalance());
                try{
                        System.out.println("Withdrawing $100");
                        c.withdraw(100.00);
                        System.out.println("Balance: " + c.getBalance());
                        System.out.println("Withdrawing $600");
                        c.withdraw(600.00);
                        System.out.println("Balance: " + c.getBalance());
                } catch(InsufficientFundsException e) {
                        System.out.println("Sorry, but you are short $" + e.getAmount());
                        //e.printStackTrace();
                }
        }
}






    
    
    
    

