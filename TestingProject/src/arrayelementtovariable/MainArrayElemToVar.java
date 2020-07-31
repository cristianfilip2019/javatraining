
package arrayelementtovariable;

import java.lang.reflect.Array;
import java.util.Arrays;


public class MainArrayElemToVar {
        
        public static void main(String[] args) {
                String[] arr = {"darius", "cristian", "filip"};
                ArrayElemToVar variable = new ArrayElemToVar(arr[1]);
                
                System.out.println(variable.getVar());
                
                
        }        
}
