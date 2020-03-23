
package finalclasses;


public class FinalClasses {
    
    public static final class Car{
        public void move(){
            System.out.println("the car is moving");
        }
    }

    static class Plane extends Car{}
    
    public static void main(String[] args) {
       Car ford = new Car();
       Plane airbus = new Plane();
       ford.move();
       airbus.move();
    }
    
}
