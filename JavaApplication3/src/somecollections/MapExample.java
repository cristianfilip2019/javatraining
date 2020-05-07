/*
 * Map example
 */
package somecollections;

import java.util.HashMap;
import java.util.Map;

/**
 * Map example
 * @author servi
 */
public class MapExample {

        public static void main(String[] args) {
               Map<Integer, String> map = new HashMap<>();
               map.put(1, "Darius");
               map.put(2, "Cristian");
               map.put(3, "fiul");
               map.put(4, "tata");
               for(Map.Entry m : map.entrySet()){
                       System.out.println(m.getKey()+ " " + m.getValue());
               }
        }
        
}
