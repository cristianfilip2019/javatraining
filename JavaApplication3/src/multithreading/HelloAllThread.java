/*
 * Implementing a new thread extending class Thread
 * Este necesara implementarea metodei main
 */
package multithreading;

/**
 * Implementing a new thread extending class Thread
 * @author servi
 */
public class HelloAllThread extends Thread {
        @Override
        public void run(){
                System.out.println("Hello all!");
                System.out.println("My priority is: " + this.getPriority());
                System.out.println("My thread ID is: " + this.getId());
                System.out.println("My thread name is: " + this.getName());
                System.out.println("My thread state is: " + this.getState());
                System.out.println("My group of threads is: " + this.getThreadGroup());
        }
        
        public static void main(String[] args) {
                Thread t = new HelloAllThread();
                System.out.println("Thread priority: " + t.getPriority());
                t.setPriority(6);
                System.out.println("Thread new priority: " + t.getPriority());
                t.start();
        }       
}
