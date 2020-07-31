/*
 * Test LinkedList
 */
package linkedlist;

import java.util.LinkedList;

/**
 * Test LinkedList
 * @author servi
 */
public class LinkedListClass {
        private LinkedList<String> oLista = new LinkedList<>();
        private String numeDeFamilie;
        
        public void addElements(String nume, String numeDeFamilie){
                oLista.add(nume);
                this.numeDeFamilie = numeDeFamilie;
        }      
        public LinkedList<String> getList(){
                return oLista;
        }    
        public String getNumeDeFamilie(){
                return numeDeFamilie;
        }
}
