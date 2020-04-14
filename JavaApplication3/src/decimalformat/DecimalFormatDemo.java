/*
 * Test Decimal Format
 */
package decimalformat;

import java.text.*;
/**
 * Test Decimal Format
 * @author servi
 */
public class DecimalFormatDemo {
    static public void customFormat(String pattern, double input){
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(input);
        System.out.println(input + "    "  + pattern + "    " + output);
    }
    public static void main(String[] args) {
        customFormat("###,###.####", 123456.789);
        customFormat("#,###.##", 123456.789);
        customFormat("000000.000", 123.78);
        customFormat("$###,###.###", 12345.67);
    }
    
}
