
package multithreading;

/**
 *
 * @author servi
 */
public class MultithreadingManagement {
        public static void main(String[] args) {
                // create, start and display info of thread HelloAllThread extending Thread
                HelloAllThread tlHA;
                tlHA = new HelloAllThread();
                tlHA.start();
                System.out.println("HelloAll thread state is: " + tlHA.getState());
                //create, start and display info of thread HelloWorldThread extending Thread
                HelloWorldThread tlHW = new HelloWorldThread();
                tlHW.start();
                System.out.println("HelloWorld thread state is: " + tlHW.getState());
                //create, start and display info of thread HelloWorldInterface extending Runnable
                Thread tlHWI = (new Thread(new HelloWorldInterface()));
                tlHWI.start();
                System.out.println("HelloWorldInterface thread state is: " + tlHWI.getState());
                System.out.println("HelloWorldInterface thread priority is: " + tlHWI.getPriority());
                System.out.println("HelloWorldInterface thread ID is: " + tlHWI.getId());
                System.out.println("HelloWorldInterface thread name is: " + tlHWI.getName());
                System.out.println("HelloWorldInterface group of threads is: " + tlHWI.getThreadGroup());
                //create, start and display info of thread HelloAllInterface extending Runnable
                Thread tlHAI = (new Thread(new HelloAllInterface()));
                tlHAI.start();
                System.out.println("HelloWorldInterface thread state is: " + tlHAI.getState());
                System.out.println("HelloWorldInterface thread priority is: " + tlHAI.getPriority());
                System.out.println("HelloWorldInterface thread ID is: " + tlHAI.getId());
                System.out.println("HelloWorldInterface thread name is: " + tlHAI.getName());
                System.out.println("HelloWorldInterface group of threads is: " + tlHAI.getThreadGroup());
                
        }
        
}
