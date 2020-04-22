
package electronicbooks;

import java.util.LinkedList;


public class EBook extends ElectronicBook{

        public EBook(String title, String isbn, String author, String downloadLink,
                String remarkAndNote, String publisher, double price, FormatOfElectronicBook electronicFormat,
                YearOfPublication yearOfPublication)
        {
                super(title, isbn, author, downloadLink, remarkAndNote, publisher, price, electronicFormat, yearOfPublication);
        }
        public enum EBookReader{KINDLE, ANDROID_DEVICE, WINDOWS};
        private EBookReader reccomendedReader;        
}
