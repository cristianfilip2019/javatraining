
package abstractexamplenew;

public final class Salary extends Employee{
    private double salary;

     public Salary(String name, String adress, int number, double salary){
        super(name, adress, number);
        setSalary(salary);
    }

    @Override
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