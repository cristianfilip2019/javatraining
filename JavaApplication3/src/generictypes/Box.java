
package generictypes;


public class Box<T> {
    private T t;
    
    public void set(T t){
        this.t = t;
    }
    
    public T get(){
        return t;
    }
    
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
        System.out.println(u);
        System.out.println(get());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        //integerBox.inspect("some text");
        
        Integer intObject;
        intObject = 20;
        integerBox.inspect(intObject);
        
        Double doubleObject;
        doubleObject = 30.30;
        integerBox.inspect(doubleObject);
    }
}
