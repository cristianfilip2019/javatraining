
package Abstraction;

public abstract class Employee {
    private final String name;
    private final String adress;
    private final int number;
    
    //Constructing an Employee
    public Employee(String name, String adress, int number){
        this.name = name;
        this.adress = adress;
        this.number = number;
    }

    public void mailCheck(){
        System.out.println("Mailing a check to " + this.name + this.adress);
    }
    
    public String getName(){
        return name;
    }
    
    public String getAdress(){
        return adress;
    }
    
    /*public void setAdress(String newAdress){
        adress = newAdress;
    }*/
    
    public int getNumber(){
        return number;
    }
    
    public String toString(){
        return name + " " + adress + " " + number;
    }
}
