
package nestedclasses;

public class OuterClass{
    private int x = 1;
    
    public void innerInstance(){
        InnerClass1 inner = new InnerClass1();
        inner.seeOuter();
    }
    
    public static void main(String[] args){
        OuterClass obj = new OuterClass();
        obj.innerInstance();
    }
    class InnerClass1{
        public void seeOuter(){
            System.out.println("Outer value of x is:" + x);
        }
    }
}
