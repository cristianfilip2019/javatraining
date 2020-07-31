
package arraytesting;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

        public static void main(String[] args) {
                String[] nume = new String[]{"darius", "cristian", "mama", "tata"};
                List<String> list = Arrays.asList(nume);
                if(list.contains("darius")){
                        System.out.println(nume[0] + " te iubesc");
                }
        }
        
}
