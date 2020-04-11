
package javaExceptions;

public class BankDemo{
        public static void main(String[] args){
                CheckingAccount c = new CheckingAccount(101);               
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

class CheckingAccount {
        private double balance;
        private int number;
        public int depositAmount;
        public CheckingAccount(int number){
                this.number=number;
        }    
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
        public int getNumber(){
                return number;
        }
}

class InsufficientFundsException extends Exception{
        private double amount;
        public InsufficientFundsException(double amount){
                this.amount=amount;
        }
        public double getAmount(){
                return amount;
        }
}


    
    
    
    

