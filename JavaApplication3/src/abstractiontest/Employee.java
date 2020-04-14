/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontest;

/**
 *
 * @author servi
 */
public abstract class Employee{
    private final String name;
    private final String adress;
    private final int number;
    
    public Employee(String name, String adress, int number){
        this.name = name;
        this.adress = adress;
        this.number = number;               
    }

    public void sendSalary(){
        System.out.println("Salary at " + adress + " to "  + " " + name + " " + number);
    }
    
    public String getName(){
        return name;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public int getNumber(){
        return number;
    }
}
