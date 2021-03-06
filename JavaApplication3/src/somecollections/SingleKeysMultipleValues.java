/*
 * Single Keys Multiple Values test
 */
package somecollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Single Keys Multiple Values test
 * @author servi
 */
public class SingleKeysMultipleValues {

        public static void main(String[] args) {
                //create map to store
                Map<String, List<String>> map = new HashMap<>();
                
                //create list one and store values
                List<String> valSetOne = new ArrayList<>();
                valSetOne.add("Apple");
                valSetOne.add("Aeroplane");
                
                //create list two and store values
                List<String> valSetTwo = new ArrayList<>();
                valSetTwo.add("Bat");
                valSetTwo.add("Banana");
                
                //create list 3 and add values
                List<String> valSetThree = new ArrayList<>();
                valSetThree.add("Cat");
                valSetThree.add("Car");
                
                //put values into map
                map.put("A", valSetOne);
                map.put("B", valSetTwo);
                map.put("C", valSetThree);
                
                //iterate and display values
                System.out.println("Fetching keys and correspondins values");
                for(Map.Entry<String, List<String>> entry : map.entrySet()){
                        String key = entry.getKey();
                        List<String> values = entry.getValue();
                        System.out.println(key+ values);                       
                }
        }        
}
