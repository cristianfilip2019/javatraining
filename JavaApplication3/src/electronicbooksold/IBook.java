/*
 * IBook class
 */
package electronicbooksold;

/**
 * IBook class
 * @author servi
 */
public class IBook extends ElectronicBook{

        private final String title = "Java for begginers";
        private final String isbn = "523968-67";
        private final String author = "Darius Mihai Filip";
        private final String downloadLink = "www.carturesti.ro";
        private final String remarkAndNote = "Perfect book for begginers";
        private final String publisher = "Editura Aurora";
        private final double price = 140.00;
        private final FormatOfElectronicBook electronicFormat = ElectronicBook.FormatOfElectronicBook.IBook;
        private final YearOfPublication yearOfPublication = ElectronicBook.YearOfPublication.Y_2013;

        public IBook() {
                super.setBookSpecifications(title, isbn, author, downloadLink, remarkAndNote, publisher, price, electronicFormat,
                        yearOfPublication);
        }
        public enum IBookReader{IPHONE, MACBOOK, IPAD};
        private final IBookReader reccomendedReader = IBook.IBookReader.MACBOOK;
        
        public IBookReader getReccomendedReader(){
                return reccomendedReader;
        } 
}
