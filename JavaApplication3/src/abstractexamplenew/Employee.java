
package abstractexamplenew;

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
