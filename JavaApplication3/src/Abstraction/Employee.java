
package Abstraction;

public abstract class Employee {
    private String name;
    private String adress;
    private int number;
    
    //Constructing an Employee
    public Employee(String name, String adress, int number){
        this.name = name;
        this.adress = adress;
        this.number = number;
    }
     //Inside Employee computePay
    public double computePay(){
        return 0.0;
    }
    
    public void mailCheck(){
        System.out.println("Mailing a check to " + this.name + this.adress);
    }
    
    public String toString(){
        return name + " " + adress + " " + number;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public void setAdress(String newAdress){
        adress = newAdress;
    }
    
    public int getNumber(){
        return number;
    }
}
