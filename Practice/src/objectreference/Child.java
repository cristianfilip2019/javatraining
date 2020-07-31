
package objectreference;


public class Child extends Parent {

        @Override
        public void parentMethod() {
                System.out.println("I am the parentMethod in the Child class");
        }
        
        public void childMethod(){
                System.out.println("I am the child");
        }
        
}
