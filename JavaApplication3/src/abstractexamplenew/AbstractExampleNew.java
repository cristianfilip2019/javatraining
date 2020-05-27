/*
        Main method of package abstractexamplenew.
*/
package abstractexamplenew;

public class AbstractExampleNew {

    public static void main(String[] args) {
        Salary sal = new Salary("Cristian", "Bucuresti", 4, 50000.00); //Creates an object, sal of type Salary, with the constructor of Salary, with 4 arguments.
        Employee emp = new Salary("Darius", "Bucuresti", 1, 100000.00); //Creates an object, emp of type Employee, with the constructor of Salary, with 4 arguments.      
        sal.sendSalary(); //Call sendSalary() using Salary reference, method of Salary class.
        emp.sendSalary(); //Call sendSalary() using Employee reference, method of Salary class.
        emp.mailCheck();  //Call mailCheck() using Employee reference, method of Employee class.
        sal.mailCheck();  //Call mailCheck() using Salary reference, method of Employee class.
    }
    
}
