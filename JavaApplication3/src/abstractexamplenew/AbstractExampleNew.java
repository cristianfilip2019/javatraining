
package abstractexamplenew;

public class AbstractExampleNew {

    public static void main(String[] args) {
        Salary sal = new Salary("Cristian", "Bucuresti", 4, 50000.00);
        Employee emp = new Salary("Darius", "Bucuresti", 1, 100000.00);      
        sal.sendSalary();
        emp.sendSalary();
    }
    
}
