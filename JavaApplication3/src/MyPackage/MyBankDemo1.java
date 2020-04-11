
package MyPackage;

import java.util.Scanner;
import javaExceptions.*;

public class MyBankDemo1{
        public static void main(String[] args){
                CheckingAccount c = new CheckingAccount(101);
                c.operations();                
        }
}
class CheckingAccount {
        
        private int balance = 1000;
        private final int number;
        
        public CheckingAccount(int number){
                this.number=number;
        }           
        public void operations() {
                PinCheck pinCk = new PinCheck();
                pinCk.pinChecking();
                if(pinCk.getCorrectPin()){
                        System.out.println("Deposit (d)/ Withdrawal(w) : ");
                        Scanner scanOperation =new Scanner(System.in);
                        char operation = scanOperation.next().charAt(0);
                        switch (operation) {
                                case 'd':
                                        System.out.println("Deposit amount: ");
                                        Scanner scanDeposit = new Scanner(System.in);
                                        int depositAmount = scanDeposit.nextInt();
                                        System.out.println("Depositing: " + depositAmount);
                                        balance += depositAmount;
                                        System.out.println("Balance: " + balance);
                                        break;
                                case 'w':
                                        System.out.println("Withdraw amount: ");
                                        Scanner scanWithdraw = new Scanner(System.in);
                                        int withdrawAmount = scanWithdraw.nextInt();
                                        System.out.println("Withdrawing: " + withdrawAmount);
                                        if(withdrawAmount <= balance){
                                                balance-=withdrawAmount;
                                                System.out.println("Balance: " + balance);
                                        }else{
                                                int needs = withdrawAmount - balance;
                                                System.out.println("Balance: " + balance);
                                        }       break;
                                default:
                                        System.out.println("Incorrect operation");
                                        operations();
                                        break;
                        }
                }else{
                        System.out.println("Incorrect pin.");
                        operations();
                }
        }
                public int getBalance() {
                        return balance;
                }
                public int getNumber(){
                        return number;
                }
}
class PinCheck{
        private final String pin = "1234";
        boolean correctPin;
        public boolean pinChecking(){
                System.out.println("Insert pin:");
                Scanner scanPin =new Scanner(System.in);
                String insertedPin = scanPin.nextLine();                
                correctPin = insertedPin.equals(pin);
                return correctPin;
        }        
        public boolean getCorrectPin(){
                return correctPin;
        }
}
 


      




    
    
    
    

