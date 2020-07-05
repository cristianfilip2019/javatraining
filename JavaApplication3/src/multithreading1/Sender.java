
package multithreading1;

public class Sender {
        
        public void send(String msg){
                System.out.println("\n" + "Sending" + msg);
                try{
                        Thread.sleep(1000);
                }
                catch (Exception e){
                        System.out.println("Thread interrupted.");
                }
                System.out.println(msg + "Sent");                        
        }
}
