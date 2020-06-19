
package multithreading;

/**
 *
 * @author servi
 */
public class SleepingThread {
        public static void main(String[] args) throws InterruptedException {
               String importantInfo[] = {
                       "We can put a thread on pause",
                       " using static sleep method,",
                       " of class Thread.",
                       " But is this a perfect and precise way to do that?"
               };
               
                for (String importantInfo1 : importantInfo) {
                        //pause 4 seconds
                        Thread.sleep(4000);
                        //print next String from initial array
                        System.out.println(importantInfo1);
                }
        }
        
}
