
package OOPMainConceptsImplementation;

/**
 *
 * @author servi
 */
public class Cars {

   
    public static void main(String[] args) {
        Car ford = new Car();
        ford.setColor(Car.Color.YELLOW);
        ford.setName("FORD");
        ford.setSpeed((short)90);
        //ford.increaseSpeed((short)100);
        System.out.println("Car brand - " + ford.getName());
        System.out.println("Color - " + ford.getColor());
        System.out.println("Speed - " + ford.getSpeed());
    }
    
}
