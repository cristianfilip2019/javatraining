
package NestedClasses;


public class LocalClassDemoEx1 {
    public void methodOne(){
        
        class Inner{
            public void sum(int i, int j){
                System.out.println("the sum: " + (i + j));
            }
        }
        Inner obj = new Inner();
        obj.sum(10, 20);
        obj.sum(100, 200);
    }

    public static void main(String[] args) {
        LocalClassDemoEx1 obj1 = new LocalClassDemoEx1();
        obj1.methodOne();
    }
    
}
