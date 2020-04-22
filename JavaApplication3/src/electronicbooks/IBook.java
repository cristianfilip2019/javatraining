/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicbooks;

import java.util.LinkedList;

/**
 *
 * @author servi
 */
public class IBook extends ElectronicBook{

        public IBook(String title, String isbn, String author, String downloadLink,
                String remarkAndNote, String publisher, double price, FormatOfElectronicBook electronicFormat,
                YearOfPublication yearOfPublication)
        {
                super(title, isbn, author, downloadLink, remarkAndNote, publisher, price, electronicFormat, yearOfPublication);
        }
        public enum IBookReader{IPHONE, MACBOOK, IPAD};
        private IBookReader reccomendedReader;
}
