/*
 *  Implementing a new thread extending class Thread
 */
package multithreading;

/**
 * Implementing a new thread extending class Thread
 * @author servi
 */
public class HelloWorldThread extends Thread{
        @Override
        public void run(){
                System.out.println("Salut lume!");
        }
        public static void main(String[] args) {
                Thread t = new HelloWorldThread();
                System.out.println("Thread priority: " + t.getPriority());
                t.setPriority(8);
                System.out.println("Thread new priority: " + t.getPriority());
                t.start();
        }
        
}
