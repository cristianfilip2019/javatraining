/*
        Is declared abstract(it cannot be instantiated).
        It has 3 attributes(variables, memory, inputs), declared private, final.
        It has one explicit constructor, with 3 arguments.
        It has a method, mailCheck() witch prints in the console a string + name value + adress value.
        It has get() for all three attributes.       
*/

package abstractexample;

public abstract class Employee {
        //It has 3 attributes(variables, memory, inputs), declared private, final.
        private final String name;
        private final String adress;
        private final int number;

        //It has one explicit constructor, with 3 arguments.
        public Employee(String name, String adress, int number) {
                // this keyword sets the value of class attributes.
                this.name = name;
                this.adress = adress;
                this.number = number;
        }
        //It has a method, mailCheck() witch prints in the console a string + name value + adress value.
        public void mailCheck() {
                System.out.println("Mailing a check to " + name + adress);
        }
        //It has get() for all three attributes.
        public String getName() {
                return name;
        }

        public String getAdress() {
                return adress;
        }

        public int getNumber() {
                return number;
        }
        //It has overridden toString()(of Object class) witch returns the string representation of the object.
        public String toString() {
                return name + " " + adress + " " + number;
        }
}
