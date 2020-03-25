
package Abstraction1;

abstract class Employee{
    private String name;
    private String adress;
    private int number;
    
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

class Salary extends Employee{
    private double salary;

     public Salary(String name, String adress, int number, double salary){
        super(name, adress, number);
        setSalary(salary);
    }

    public void sendSalary(){
        System.out.println("Send salary " + salary + " at " + getAdress() + " to " + getName() + " number " + getNumber());
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double newSalary){
        salary = newSalary;
    }
}

public class AbstractionTest {

    public static void main(String[] args) {
        Salary sal = new Salary("Cristian", "Bucuresti", 4, 50000.00);
        Employee emp = new Salary("Darius", "Bucuresti", 1, 100000.00);      
        sal.sendSalary();
        emp.sendSalary();
    }
    
}
