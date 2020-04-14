/*
 * Test formatting numbers
 * and open the template in the editor.
 */
package formattingnumbers;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * Test formatting numbers
 * @author servi
 */
public class FormattingNumbers {

    public static void main(String[] args) {
        //formatting numbers
        long n = 461012; // formatting a long number
        System.out.format("%d%n", n);
        System.out.format("%010d%n", n);
        System.out.format("%+,d%n", n);
        System.out.format("%,d%n", n);
        double pi = Math.PI;//formatting a double number
        System.out.format("%f%n", pi);
        System.out.format("%.3f%n", pi);
        
        //formatting calendar objects
        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tI:%tM %tp%n", c, c, c);
        System.out.format("%tD%n", c);
        TimeZone tz = TimeZone.getTimeZone("Europe/Paris");
        Calendar cal = Calendar.getInstance(tz);
        System.out.format("%tI:%tM %tp%n", cal, cal, cal);
    }
    
}
