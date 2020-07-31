/*
 * Play with collections class
 */
package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Play with collections class
 * @author servi
 */
public class PlayWithCollections {
        private final List<String> listaNume = new ArrayList<>();
        private final List<String> listaNume1 = new ArrayList<>();

        public static void main(String[] args) {
                System.out.println("Insert name: ");
                Scanner scan = new Scanner(System.in);
                String nume = scan.nextLine();
                PlayWithCollections addLista = new PlayWithCollections();
                addLista.listaNume1.add(nume);
                System.out.println(addLista.listaNume1);
        }
        
}
