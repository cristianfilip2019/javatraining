
package javaexceptions4;

import java.io.IOException;

public class ListOfNumbersMain {

        public static void main(String[] args) throws IOException{
        ListOfNumbers createList = new ListOfNumbers();
        createList.makeFile();
        createList.writeList();       
        }
}
