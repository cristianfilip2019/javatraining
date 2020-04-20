
package testsuper;

public final class Dog extends Animal{
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