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
public class PinCheck{
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
