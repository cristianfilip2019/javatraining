/*
 * String and Number conversions
 */
package StringAndNumberConversions;

/**
 * String and Number conversions
 * @author servi
 */
public class StringAndNumberConversions {

    public static void main(String[] args) {
        
        //Conversion from string to number
        String stringToNumber = "12.3f";
        float f = (Float.valueOf(stringToNumber));
        System.out.println("this string: " + stringToNumber + " became the float number " + f);
        
        // or you can use the parseXXXX() method
        float ff = Float.parseFloat(stringToNumber);
        System.out.println("this string: " + stringToNumber + " became the float number " + ff);
        
        // conversion from number to string
        Float fNumb = 15.8f;
        Integer sNumb = 175;
        System.out.println("the numbers converted to strings are: " + fNumb.toString() + " and " + sNumb.toString());
    }    
}
