
package onlinetesting;

public class OnlineTesting {
        boolean sleep;
        public boolean sleepIn(boolean weekday, boolean vacation){
                if(!weekday || vacation){
                        sleep = true;
                }
                return sleep;
        }

        public static void main(String[] args) {
                OnlineTesting obj = new OnlineTesting();
                obj.sleepIn(true, true);
                System.out.println(obj.sleep);
        }
        
}
