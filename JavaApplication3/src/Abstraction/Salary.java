
package Abstraction;

public class Salary extends Employee{
    private double salary;
    
    public Salary(String name, String adress, int number, double salary){
        super(name, adress, number);
        setSalary(salary);
    }
    
    //Whithin mailCheck of salary class
    public void mailCheck(){
        System.out.println("Mailing ckeck to "  + getName() + " with salary "+ salary);
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }
    
    public double computePay(){
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}
