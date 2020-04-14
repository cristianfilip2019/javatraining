/*
 * Test StringBuilder
 */
package stringbuilder;

/**
 * Test StringBuilder
 * @author servi
 */
public class StringBuilderClass {

    public static void main(String[] args) {
        StringBuilder strB = new StringBuilder();//creates empty builder, capacity 16.
        System.err.println("Initial StringBuilder content is: " + strB);
        //adds 9 character string at begginning
        strB.append("Appended string!");
        System.out.println("After append StringBuilder content is: " + strB);
        strB.ensureCapacity(255);//ensures that the capacity is at least equal to the specified minimum.
        strB.append(25);
        System.out.println("after append 25 content is: " + strB);
        strB.delete(17,19);
        System.out.println("After deleting from index 17 to 19 content is:" + strB);
        int capacity = strB.capacity();
        System.out.println(capacity);
        
        StringBuilder str = new StringBuilder("Test capacity");
        int capacity1 = str.capacity();
        System.out.println("the capacity of string '" + str + "' is " + capacity1);
        
    }
    
}
