
package multithreading1;

public class ThreadedSend extends Thread{
        private String msg;
        Sender sender;
        
        //receives a message object and a string message to be sent
        
        ThreadedSend(String m, Sender obj){
                msg = m;
                sender = obj;
        }
        
        public void run(){
                //Only one thread can send a message at a time.
                synchronized(sender){
                        //synchronizing the snd object
                        sender.send(msg);
                }
        }
        
}
