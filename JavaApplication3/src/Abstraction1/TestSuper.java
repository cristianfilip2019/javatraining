
package Abstraction1;

class Animal {
    private String color;
    
    public Animal(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }   
}

class Dog extends Animal{
    String race;
    
    public Dog(String color, String race){
        super(color);
        setRace(race);
    }
    
    public void printDog(){
        System.out.println(getColor());
        System.out.println(race);
    }
    
    public String getRace(){
        return race;
    }
    
    public void setRace(String newRace){
        race = newRace;
    }
}

public class TestSuper{
    
    public static void main(String[] args) {
        Dog d = new Dog("black", "pitbull");
        d.printDog();
    }
}