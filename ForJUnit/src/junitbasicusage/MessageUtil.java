/*
 * JUnit tests learning
 */
package junitbasicusage;

/**
 * JUnit tests learning
 * @author servi
 */
public class MessageUtil {
        private String message;
        
        public MessageUtil(String message){
                this.message = message;
        }
        
        public String printMessage(){
                System.out.println(message);
                return message;
        }
}
