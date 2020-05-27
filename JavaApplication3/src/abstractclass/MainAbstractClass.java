/*
        Main method of package abstractclass.
        Creates one object, obj of type AbstractClass.
        Calls inherited concreteMethod() of AbstractClass.
        Calls inherited, overriden and implemented abstractMethod() of AbstractClass. 
*/
package abstractclass;

public class MainAbstractClass{
    
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass(); //Creates one object, obj of type AbstractClass.
        obj.concreteMethod(); //Calls inherited concreteMethod() of AbstractClass.
        obj.abstractMethod(); //Calls inherited, overriden and implemented abstractMethod() of AbstractClass. 
    }    
}
