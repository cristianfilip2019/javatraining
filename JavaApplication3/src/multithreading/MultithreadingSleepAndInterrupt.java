
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultithreadingSleepAndInterrupt {
        public static void main(String[] args) {
                //create two different SleepingThread, start them and interrupt one of them
                SleepingThread st1 = new SleepingThread();
                SleepingThread1 st2 = new SleepingThread1();
                st1.start();
                st2.start();
                //current thread will sleep for 1.5 seconds
                try{
                        Thread.sleep(1500);
                }catch(InterruptedException ex){
                        Logger.getLogger(MultithreadingSleepAndInterrupt.class.getName()).log(Level.SEVERE, null, ex);
                }
                //before to interrupt st1
                st1.interrupt();
        }
        
}
