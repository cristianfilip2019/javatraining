
package countdown;

import java.util.LinkedList;
import java.util.Queue;

public class Countdown{
        
        public void countDown() throws InterruptedException {
                int time = Integer.parseInt("5");
                Queue<Integer> queue = new LinkedList<>();
                for (int i = time; i >= 0; i--)
                        queue.add(i);
                while(!queue.isEmpty()){
                        System.out.println(queue.remove());
                        Thread.sleep(1000);
                }
        }       
}
