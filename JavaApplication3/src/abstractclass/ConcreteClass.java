/*
        Extends(inherits, is the child, subclass) AbstractClass.
        Implements and Overrides abstractMethod() inherited from AbstractClass.
        abstactMethod() prints one string in console.
 */
package abstractclass;

public class ConcreteClass extends AbstractClass {
        //Implements and Overrides abstractMethod inherited from AbstractClass
        //abstactMethod prints one string in console
        @Override
        public void abstractMethod() {
                System.out.println("implementing abstract method");
        }
}
