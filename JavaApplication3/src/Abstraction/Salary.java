
package Abstraction;

public final class Salary extends Employee{
    private double salary;
    
    public Salary(String name, String adress, int number, double salary){
        super(name, adress, number);
        setSalary(salary);
    }
    
    @Override
    public void mailCheck(){
        System.out.println("Mailing ckeck to "  + getName() + " with salary "+ salary + " to adress " + getAdress());
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }
}
