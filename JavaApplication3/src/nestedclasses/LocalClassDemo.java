
package nestedclasses;


public class LocalClassDemo {
    private final int x = 1;
    
    public void doThings(){
        String name = "local variable";
        
        class LocalClass{
            public void seeOuter(){
                System.out.println("outer value of x is: " + x);
                System.out.println("value of name is: " + name);
            }
        }
        
        LocalClass obj = new LocalClass();
        obj.seeOuter();   
    }
   
    public static void main(String[] args) {
        LocalClassDemo obj1 = new LocalClassDemo();
        obj1.doThings();
        
    }
    
}
