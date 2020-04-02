/*
 * Test characters nd substrings
 */
package CharactersAndSubstrings;

/**
 * Test characters nd substrings
 * @author servi
 */
public class CharactersAndSubstrings {

    public static void main(String[] args) {
        // getting Characters and Substrings by index
        String str = "We have a string here";
        int charIndex = 5;
        Character getCharInIndex = str.charAt(charIndex);
        int strLen = str.length();
        int firstIndexOfSubstring = 2;
        int SecondIndexOfSubstring = 9;
        String subStringIndex = str.substring(firstIndexOfSubstring, SecondIndexOfSubstring);
        System.out.println("Character from index " + charIndex + " of string '" + str + "' is " + "'" + getCharInIndex + "'");
        System.out.println("The length of the string '" + str + "' is " + strLen);
        System.out.println(
                    "The substring from index " + firstIndexOfSubstring + " to index " 
                            + SecondIndexOfSubstring + " of string '" + str + "' is '" + subStringIndex + "'");
        
        //processing string
        System.out.println("String '" + str + "' without white spaces is '" + str.trim() + "'");
        System.out.println("String '" + str + "' in lowercase is '" + str.toLowerCase() + "'");
        System.out.println("String '" + str + "' in uppercase is '" + str.toUpperCase() + "'");
        //searching in strings
        int substringStartIndex = str.indexOf("v");
        System.out.println("index of char v in string '" + str + "' is " + substringStartIndex);
        //replace a character with another in a string
        System.out.println("in string '" + str + "' replacing e with u results '" + str.replace('e', 'u') + "'");
        //compare strings
        String anotherStr = "We have a string here";//another string object with same content
        System.out.println(str.compareTo(anotherStr));
        System.out.println("If two string objects have the same content these are equals?: " + str.equals(anotherStr));    
    }
}
