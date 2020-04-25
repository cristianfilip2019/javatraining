/*
 * Electronic book class
 */
package electronicbooksold;

import java.util.LinkedList;

/**
 * Electronic book class
 * @author servi
 */
public class ElectronicBook {
        public enum YearOfPublication{Y_2010, Y_2011,Y_2012, Y_2013, Y_2014, Y_2015, Y_2016, Y_2017, Y_2018, Y_2019, Y_2020};
        public enum FormatOfElectronicBook{IBook, Ebook, PDF, WORD, HTML};
        private String title;
        private String isbn;
        private final LinkedList<String> authors = new LinkedList<>();
        private final LinkedList<String> downloadLinks= new LinkedList<>();
        private final LinkedList<String> remarksAndNotes= new LinkedList<>();
        private String publisher;
        private double price;
        private FormatOfElectronicBook electronicFormat;
        private YearOfPublication yearOfPublication;
        
        public void setBookSpecifications(String title, String isbn, String author, String downloadLink,
                String remarkAndNote, String publisher, double price, FormatOfElectronicBook electronicFormat,
                YearOfPublication yearOfPublication){
                this.title = title;
                this.isbn = isbn;
                authors.add(author);
                downloadLinks.add(downloadLink);
                remarksAndNotes.add(remarkAndNote);
                this.publisher = publisher;
                this.price = price;
                this.electronicFormat = electronicFormat;
                this.yearOfPublication = yearOfPublication;
        }
        
        public String getTitle(){
                return title;
        }
        
        public String getIsbn(){
                return isbn;
        }

        public LinkedList<String> getAuthors() {
                return authors;
        }

        public LinkedList<String> getDownloadLinks() {
                return downloadLinks;
        }

        public LinkedList<String> getRemarksAndNotes() {
                return remarksAndNotes;
        }

        public String getPublisher() {
                return publisher;
        }

        public double getPrice() {
                return price;
        }

        public FormatOfElectronicBook getElectronicFormat() {
                return electronicFormat;
        }

        public YearOfPublication getYearOfPublication() {
                return yearOfPublication;
        }              
}
