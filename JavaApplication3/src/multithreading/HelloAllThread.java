/*
 * Implementing a new thread extending class thread
 */
package multithreading;

/**
 * Implementing a new thread extending class thread
 * @author servi
 */
public class HelloAllThread extends Thread {

        @Override
        public void run() {
                System.out.println("Hello all!");
                System.out.println("Thread priority is: " + this.getPriority());
                this.setPriority(1);
                System.out.println("Thread new priority is: " + this.getPriority());
        }

        public static void main(String[] args) {
                Thread th = new HelloAllThread();
                th.start();
        }

}
