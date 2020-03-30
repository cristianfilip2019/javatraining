
package AbstractClasses;

/**
 *
 * @author servi
 */
abstract class MyClass{
    public void concreteMethod(){
        System.out.println("concrete method of abstract class");
    }
    abstract public void abstractMethod();
}


class AbstractClass extends MyClass{
    @Override
    public void abstractMethod(){
        System.out.println("implementing abstract method");
    }

    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass();
        obj.concreteMethod();
        obj.abstractMethod();
    }
    
}
