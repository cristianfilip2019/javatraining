
package arraytesting;

import java.util.Arrays;

public class ArrayPlay {

        public static void main(String[] args) {
                String[] cars = {"volvo", "bmw", "ford", "mazda"};
                //cars[0] = "opel";
                
                System.out.println(Arrays.toString(cars));
                
                for (int i = 0; i < cars.length; i++){
                        System.out.println(cars[i]);
                }
                
        }       
}
