
package multithreading;

/**
 *
 * @author servi
 */
public class HelloWorldInterface implements Runnable{
        @Override
        public void run(){
                System.out.println("Hello World!");                
        }

        public static void main(String[] args) {
                (new Thread(new HelloWorldInterface())).start();
                
        }
        
}
