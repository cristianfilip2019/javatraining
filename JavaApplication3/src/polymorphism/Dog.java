/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author servi
 */
public class Dog extends Animal{
    @Override
    public void animalSound(){
        System.out.println("the dog says: woof woof");
    }    
}