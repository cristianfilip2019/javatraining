/*
        Main method of package abstractexample.
        
 */
package abstractexample;

public class AbstractExampleMain {

        public static void main(String[] args) {
                Salary s = new Salary("Cristian Filip", "Bucuresti", 3, 3600.00); //Creates an object, s of type Salary, with the constructor of Salary, with 4 arguments.
                Employee e = new Salary("John Adams", "Ploiesti", 2, 2400.00);//Creates an object, e of type Employee, with the constructor of Salary, with 4 arguments.                                  
                s.mailCheck();//Call mailCheck() using Salary reference, or, call mailcheck() of Salary class.                
                e.mailCheck();//Call mailCheck() using Employee reference, method of Salary class.
                System.out.println(s); //prints s object with the help of toString() of class Salary.
                System.out.println(e);// prints e object with the help of toString() of class Salary.
        }

}
