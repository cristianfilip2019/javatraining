
package electronicbooks;

import java.util.LinkedList;


public class EBook extends ElectronicBook{
        private String title = "Learn Java at home";
        private String isbn = "768945-66";
        private String author = "Cristian Filip";
        private String downloadLink = "www.elefant.ro";
        private String remarkAndNote = "Excellent book. Higly reccomended";
        private String publisher = "Editura Nemira";
        private double price = 125.00;
        private FormatOfElectronicBook electronicFormat = ElectronicBook.FormatOfElectronicBook.PDF;
        private YearOfPublication yearOfPublication = ElectronicBook.YearOfPublication.Y_2011;

        public EBook() {
                super.setBookSpecifications(title, isbn, author, downloadLink, remarkAndNote, publisher, price, electronicFormat,
                        yearOfPublication);
        }
        public enum EBookReader{KINDLE, ANDROID_DEVICE, WINDOWS};
        private EBookReader reccomendedReader;        
}
