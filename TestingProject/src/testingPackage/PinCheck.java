
package testingPackage;

import java.util.Scanner;

public class PinCheck {
        private final String pin = "1234";
        boolean correctPin;
        public static void main(String[] args) {
                PinCheck ch = new PinCheck();
                ch.checkPin();
                System.out.println(ch.getCorrectPin());               
        }        
        public boolean checkPin(){               
                System.out.println("Insert pin:");
                Scanner scanPin =new Scanner(System.in);
                String insertedPin = scanPin.nextLine();                
                if(insertedPin.equals(pin)){
                        correctPin = true;                        
                }else{
                        correctPin = false;                        
                }
                return correctPin;
        }        
        public boolean getCorrectPin(){
                return correctPin;
        }       
}

