
package Polymorphism;

public class Animal {
    public void animalSound(){
        System.out.println("the animal makes a sound");
    }       
}

class Pig extends Animal{
    @Override
    public void animalSound(){
        System.out.println("the pig says: wee wee");
    }
}

class Dog extends Animal{
    @Override
    public void animalSound(){
        System.out.println("the dog says: woof woof");
    }    
}

class MyMainClass{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
