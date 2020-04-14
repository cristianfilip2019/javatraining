/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybankdemo;

import java.util.Scanner;

/**
 *
 * @author servi
 */
public class CheckingAccount {
        
        private int balance = 1000;
        private final int number;
        private final String pin = "1234";
        boolean correctPin;
        
        public CheckingAccount(int number){
                this.number=number;
        }  

        public void operations() {
                System.out.println("Insert pin:");
                Scanner scanPin =new Scanner(System.in);
                String insertedPin = scanPin.nextLine();                
                if(insertedPin.equals(pin)){
                        System.out.println("Current balance: " + balance);
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
                                        System.out.println("New balance: " + balance);
                                        break;
                                case 'w':
                                        System.out.println("Withdraw amount: ");
                                        Scanner scanWithdraw = new Scanner(System.in);
                                        int withdrawAmount = scanWithdraw.nextInt();
                                        System.out.println("Withdrawing: " + withdrawAmount);
                                        if(withdrawAmount <= balance){
                                                balance-=withdrawAmount;
                                                System.out.println("New balance: " + balance);
                                        }else{                                               
                                                System.out.println("Withdraw request exceeds balance.");
                                                operations();
                                        }      break;
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