
package nestedclasses;


public class OuterClassForStaticInnerClass {
    static class InnerClass{
        int a = 5;
        int b = 6;
    }
    
    public static void main(String[] args) {
        OuterClassForStaticInnerClass.InnerClass obj = new OuterClassForStaticInnerClass.InnerClass();
        System.out.println(obj.a + obj.b);
    } 
}
