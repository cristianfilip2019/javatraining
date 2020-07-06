package multithreading;

public class SleepingThread1 extends Thread{
        @Override
        public void run(){
                String importantInfo[] = {
                        "This is sleeping thread 1",
                        " just to check,",
                        " how is it working.",
                        " Timeing of sleep method is not precise?"
                };
                for (String importantInfo1 : importantInfo) {
                        try {
                                //pause 4 seconds
                                Thread.sleep(4000);
                                //print next String from initial array
                                System.out.println(importantInfo1);
                                System.out.println("I am SleepingThread1 with thread ID: " + this.getId() + " and I am running :)");
                        } catch (InterruptedException e) {
                                //metoda sleep este intreruptibila
                                System.out.println("I am SleepingThread1 with thread ID: " + this.getId() + " and I was interrupted :((");
                                        return;
                        }
                        //if the interruption was not catched in sleep we can catch it here and throw it...Where?
                        if(Thread.interrupted()){
                                System.out.println("Am fost intrerupt de main.");
                                return;
                        
                        }
                }
        }
}
