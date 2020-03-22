
package AbstractClasses;

/**
 *
 * @author servi
 */
abstract class MyClass{
    public void disp(){
        System.out.println("concrete method of abstract class");
    }
    abstract public void disp2();
}


class AbstractClass extends MyClass{
    public void disp2(){
        System.out.println("implementing abstract method");
    }

    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass();
        obj.disp();
        obj.disp2();
    }
    
}
