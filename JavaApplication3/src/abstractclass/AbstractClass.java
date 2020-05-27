/*
        contains 2 methods:
                -1 concrete method, prints one string in the console
                -1 abstract method, doing nothing
 */
package abstractclass;

public abstract class AbstractClass {
        //concrete method, prints one string in the console
        public void concreteMethod() {
                System.out.println("concrete method of abstract class");
        }
        //abstract method, doing nothing
        abstract public void abstractMethod();
}
