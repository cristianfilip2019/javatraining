
package arrayofobjects;

import java.util.Arrays;

public class StudentMain {

        public static void main(String[] args) {
                Student[] arr = new Student[5];
                arr[0]= new Student("Darius");
                arr[1]= new Student("Cristian");
                arr[2]= new Student("Student1");
                arr[3]= new Student("Student2");
                arr[4]= new Student("Student3");
                
                //for (int i=0;i<arr.length;i++){
                //        System.out.println("Element at index " + i +": " + arr[i].name);
                //}
                
                System.out.println(Arrays.toString(arr));
                
        }
        
}
