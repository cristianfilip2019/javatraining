/*
 * Implementing a new thread extending class thread
 */
package multithreading;

/**
 * Implementing a new thread extending class thread
 * @author servi
 */
public class HelloWorldThread extends Thread {
        @Override
        public void run(){
                System.out.println("Salut lume!");
                System.out.println("Thread priority is: " + this.getPriority());
                this.setPriority(10);
                System.out.println("Thread new priority is: " + this.getPriority());
        }
        public static void main(String[] args) {
                Thread t = new HelloWorldThread();
                        t.start();
        }
        
}
