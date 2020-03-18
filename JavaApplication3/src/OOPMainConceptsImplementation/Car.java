
package OOPMainConceptsImplementation;

/**
 * @author servi
 */
public class Car implements Saleable, Rentable{
    /**
     * @enum enumeration of accepted car colors
     */
    public enum Color{WHITE, RED, YELLOW, GREEN, BLACK}
    /**
     * Internal hidden fields/attributes
     */
    private Color color;
    private String name;
    private short speed;
    /**
     * Constructors
     */
    public Car(){
        name = "Default car name";
        speed = 90;
    }
    public Car(String carName, short carSpeed, Color carColor){
        name = carName;
        speed = carSpeed;
        color = carColor;
    }
    /*get-ers and set-ers*/
    public String getName(){
        return(name);
    }
    public Color getColor(){
        return(color);
    }
    public short getSpeed(){
        return(speed);
    }
    public void setName(String newName){
        name = newName;
    }
    public void setColor(Color newColor){
        color = newColor;
    }
    public void setSpeed(short newSpeed){
        speed = newSpeed;
    }
    /**
     * The method increase actual speed of Car until final speed specified.
     * @param newSpeed si new speed
     */
    public void increaseSpeed(short newSpeed){
        if(newSpeed > speed){
            speed = newSpeed;
        }
        else if(newSpeed < speed){
            decreaseSpeed(newSpeed);
        }
    }
    /**
     * the method decrease actual speed of Car until final speed specified.
     * @param newSpeed in new speed
     */
    public void decreaseSpeed(short newSpeed){
        if(newSpeed < speed){
            speed = newSpeed;
        }
        else if(newSpeed > speed){
            increaseSpeed(newSpeed);
        }
    }
    /**
     * abstract method defined in Saleable interface implemented by class Car
     * is implemented here
     * @override Saleable.getSalePrice() method
     */
    @Override
    public int getSalePrice(){
        return(12000);
    }
    /**abstract method defined in Rentable interface implemeted by class car
     * is implemeted here
     * @override Rentable.getDailyRentPrice() method
     */
    @Override
    public int getDailyRentPrice(){
        return(250);
    }
}
