
package Abstraction;

public class AbstractDemo {

    public static void main(String[] args) {
        Salary s = new Salary("Cristian Filip", "Bucuresti", 3, 3600.00);
        Employee e = new Salary("John Adams", "Ploiesti", 2, 2400.00);
        //Call mailCheck using salary reference
        s.mailCheck();
        // Call mailCheck using Employee reference
        e.mailCheck();
    }
    
}
