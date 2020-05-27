/*
        Extends(inherits, is the child, subclass) Employee class.
        It has 1 attributes(variables, memory, inputs), declared private.
        It has one explicit constructor, with 4 parameters.
                3 parameters are writing the value of the 3 inherited variables of Employee class.
                1 parameter sets the value of salary variable of this class. 
        Implements and Overrides sendSalary() inherited from Employee class, prints in the console.
        It has get() and set() for it's own attribute.                        
 */
package abstractexamplenew;

public final class Salary extends Employee {

        private double salary; // It has 1 attributes(variables, memory, inputs), declared private.
        // It has one explicit constructor, with 4 parameters.
        public Salary(String name, String adress, int number, double salary) {
                super(name, adress, number); //3 parameters are setting the value of the 3 inherited variables of Employee class, using super keyword.
                setSalary(salary); //1 parameter sets the value of salary variable of this class, calling the setSalary() with salary argument.
        }
        // Implements and Overrides sendSalary() inherited from Employee class, prints in the console.
        @Override
        public void sendSalary() {
                System.out.println("Send salary " + salary + " at " + getAdress() + " to " + getName() + " number " + getNumber());
        }
        //It has get() and set() for it's own attribute.
        public double getSalary() {
                return salary;
        }

        public void setSalary(double newSalary) {
                salary = newSalary;
        }
}
