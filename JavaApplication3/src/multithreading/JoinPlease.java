
package multithreading;

public class JoinPlease {
        public static void main(String[] args) {
                try{
                        
                        System.out.println("Create SleepMessages thread");
                        SleepingThread t = new SleepingThread();
                        t.start();
                        //Thread.sleep(4000);
                        //wait 4x4 seconds
                        t.join(8000);
                        //print a message after join
                        System.out.println("we did wait to have all texts printed by SleepMessages Thread");
                        
                }
                catch(InterruptedException e){
                        //metoda sleep este intreruptibila
                        System.out.println("I was Interrupted");
                }
        }    
}
