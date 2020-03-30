
package NestedClasses;

/**
 *
 * @author servi
 */
public class InnerClass {
    private final int myVar=15;
    class MyInnerClassDemo{
        public void seeOuter(){
            System.out.println("value of my var is: "+ myVar);
        }  
    }
    public static void main(String args[]){
        InnerClass obj = new InnerClass();
        InnerClass.MyInnerClassDemo obj1 = obj.new MyInnerClassDemo();    
        obj1.seeOuter();
        }
}
