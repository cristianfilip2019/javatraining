
package multithreading;

/**
 *
 * @author servi
 */
public class TestHelloAll {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                Thread t = (new Thread(new HelloAllInterface()));
                t.start();
                
                System.out.println("Thread priority is: " + t.getPriority());
                t.setPriority(1);
                System.out.println("New thread priority is: " + t.getPriority());
                
        }
        
}
