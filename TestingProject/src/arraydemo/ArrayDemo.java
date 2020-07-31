
package arraydemo;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        ArrayDemo.getValues(myArray);
        System.out.println("The largest value is: " + findMax(myArray));
    }   
    public static void getValues(int[] array){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.println("Please enter a number: ");
            array[i]=scan.nextInt();
        }
    }   
    public static int findMax(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }    
}
