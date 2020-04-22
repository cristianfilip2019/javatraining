/*
 * EBook class
 */
package electronicbooks;

/**
 * EBook class
 * @author servi
 */
public class EBook extends ElectronicBook{
        private final String title = "Learn Java at home";
        private final String isbn = "768945-66";
        private final String author = "Cristian Filip";
        private final String downloadLink = "www.elefant.ro";
        private final String remarkAndNote = "Excellent book. Higly reccomended";
        private final String publisher = "Editura Nemira";
        private final double price = 125.00;
        private final FormatOfElectronicBook electronicFormat = ElectronicBook.FormatOfElectronicBook.PDF;
        private final YearOfPublication yearOfPublication = ElectronicBook.YearOfPublication.Y_2011;

        public EBook() {
                super.setBookSpecifications(title, isbn, author, downloadLink, remarkAndNote, publisher, price, electronicFormat,
                        yearOfPublication);
        }
        public enum EBookReader{KINDLE, ANDROID_DEVICE, WINDOWS};
        private final EBookReader reccomendedReader = EBook.EBookReader.ANDROID_DEVICE;
        
        public EBookReader getReccomendedReader(){
                return reccomendedReader;
        } 
}
