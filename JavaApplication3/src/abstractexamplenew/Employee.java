/*
        Is declared abstract(it cannot be instantiated).
        It has 3 attributes(variables, memory, inputs), declared private, final.
        It has one explicit constructor, with 3 arguments.
        It has 2 methods:
                - sendSalary() witch prints in the console.
                - mailCheck() witch prints in the console.
        It has get() for all three attributes.       
*/
package abstractexamplenew;

public abstract class Employee {
        //It has 3 attributes(variables, memory, inputs), declared private, final.
        private final String name;
        private final String adress;
        private final int number;
        //It has one explicit constructor, with 3 arguments.
        public Employee(String name, String adress, int number) {
                // this keyword sets the value of class attributes
                this.name = name;
                this.adress = adress;
                this.number = number;
        }
        //  sendSalary() witch prints in the console.
        public void sendSalary() {
                System.out.println("Salary at " + adress + " to " + " " + name + " " + number);
        }
        //  mailCheck() witch prints in the console.
        public void mailCheck() {
                System.out.println("Mailing a check to " + name + " at " + adress);
        }
        // It has get() for all three attributes.
        public String getName() {
                return name;
        }

        public String getAdress() {
                return adress;
        }

        public int getNumber() {
                return number;
        }
}
