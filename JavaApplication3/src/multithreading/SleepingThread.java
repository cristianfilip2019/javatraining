package multithreading;

public class SleepingThread extends Thread {
        @Override
        public void run() {
                String importantInfo[] = {
                        "We can put a thread on pause",
                        " using static sleep method,",
                        " of class Thread.",
                        " But is this a perfect and precise way to do that?"
                };
                for (String importantInfo1 : importantInfo) {
                        try {
                                //pause 4 seconds
                                Thread.sleep(4000);
                                //print next String from initial array
                                System.out.println(importantInfo1);
                                System.out.println("I am sleepingThread with thread ID: " + this.getId() + " and I am running :)");
                        } catch (InterruptedException e) {
                                //metoda sleep este intreruptibila
                                System.out.println("I am SleepingThread with thread ID: " + this.getId() + " and I was interrupted :((");
                                        return;
                        }
                        //if the interruption was not catched in sleep we can catch it here and throw it...Where?
                        if(Thread.interrupted()){
                        }
                }
        }

}
