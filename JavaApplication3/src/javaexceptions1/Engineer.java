
package javaexceptions1;

import java.util.Scanner;

public class Engineer {        
        private int age;
        public void setAge(int age){
                if(age < 21 || age > 59){
                        throw new IllegalArgumentException("Invalid age");
                }                
                this.age = age;              
        }
}
