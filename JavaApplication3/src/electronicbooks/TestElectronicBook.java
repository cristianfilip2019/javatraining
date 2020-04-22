/*
 * Test ElectronicBook
 */
package electronicbooks;

/**
 * Test ElectronicBook
 * @author servi
 */
public class TestElectronicBook {

        public static void main(String[] args) {
                EBook javaEBook = new EBook();
                IBook javaIBook = new IBook();
                System.out.println("Book number one: " + "\n"
                        + "Title: " + javaEBook.getTitle() + "\n" 
                        + "ISBN: " + javaEBook.getIsbn() + "\n" 
                        + "Authors: " + javaEBook.getAuthors() + "\n"
                        + "Download links: " + javaEBook.getDownloadLinks() + "\n" 
                        + "Remarks and notes: " + javaEBook.getRemarksAndNotes() + "\n" 
                        + "Publisher: " + javaEBook.getPublisher() + "\n" 
                        + "Price: " + javaEBook.getPrice() + " ron"+ "\n" 
                        + "Electronic format: " + javaEBook.getElectronicFormat() + "\n"
                        + "Year of publication: " + javaEBook.getYearOfPublication() + "\n"
                        + "Reccomended reader: " + javaEBook.getReccomendedReader());
                System.out.println("");
                System.out.println("Book number two: " + "\n"
                        + "Title: " + javaIBook.getTitle() + "\n" 
                        + "ISBN: " + javaIBook.getIsbn() + "\n" 
                        + "Authors: " + javaIBook.getAuthors() + "\n"
                        + "Download links: " + javaIBook.getDownloadLinks() + "\n" 
                        + "Remarks and notes: " + javaIBook.getRemarksAndNotes() + "\n" 
                        + "Publisher: " + javaIBook.getPublisher() + "\n" 
                        + "Price: " + javaIBook.getPrice() + " ron"+ "\n" 
                        + "Electronic format: " + javaIBook.getElectronicFormat() + "\n"
                        + "Year of publication: " + javaIBook.getYearOfPublication() + "\n"
                        + "Reccomended reader: " + javaIBook.getReccomendedReader());
        }       
}
