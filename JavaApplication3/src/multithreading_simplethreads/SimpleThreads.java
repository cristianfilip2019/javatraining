package multithreading_simplethreads;

public class SimpleThreads {

        //display a message, preceded by the name of the current thread
        public static void threadMessage(String message) {
                String threadName = Thread.currentThread().getName();
                System.out.format("%s: %s%n", threadName, message);
        }

        private static class MessageLoop implements Runnable {

                @Override
                public void run() {
                        String importantInfo[] = {
                                "Primul mesaj al thread-ului",
                                "Al doilea mesaj al thread-ului",
                                "Al treilea mesaj al thread-ului",
                                "Ultimul mesaj al thread-ului"
                        };
                        try {
                                for (int i = 0; i < importantInfo.length; i++) {
                                        //pause 4 seconds
                                        Thread.sleep(4000);
                                        //print a message
                                        threadMessage(importantInfo[i]);
                                }
                        } catch (InterruptedException e) {
                                threadMessage("I wasn't done!");
                        }
                }
        }

        public static void main(String args[]) throws InterruptedException {
                //delay, in miliseconds before we interrupt MessageLoop thread(default one hour)
                long patience = 1000 * 60 * 60;

                threadMessage("Starting MessageLoop thread");
                long startTime = System.currentTimeMillis();
                Thread t = new Thread(new MessageLoop());
                t.start();

                threadMessage("Waiting for MessageLoop thread to finish");
                //loop until MessageLoop thread exits
                while (t.isAlive()) {
                        threadMessage("Still waiting...");
                        //wait maximum 1 second for MessageLoop thread to finish
                        t.join(1000);
                        if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
                                threadMessage("tired of waiting!");
                                t.interrupt();
                                //shouldn't be long now -- wait indefinitely
                                t.join();
                        }
                }
                threadMessage("finally!");
        }
}
