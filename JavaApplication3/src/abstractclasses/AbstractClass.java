
package abstractclasses;

public class AbstractClass extends MyAbstractClass{
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
