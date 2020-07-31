/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist1;

import java.util.LinkedList;

/**
 *
 * @author servi
 */
public class LinkList {
        LinkedList<String> lista = new LinkedList<>();
        
        public LinkList(){
        lista.add("cristian");
        }
        
        public LinkedList<String> getList(){
                return lista;
        }
}
