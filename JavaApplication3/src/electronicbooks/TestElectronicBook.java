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
                System.out.println("Book number one: " + "\n" + "Title: " + javaEBook.getTitle() + "\n" + "ISBN: " + javaEBook.getIsbn() + 
                        "\n" + "Authors: " + javaEBook.getAuthors() + "\n" + 
                        "Download links: " + javaEBook.getDownloadLinks() + "\n" + "Remarks and notes: " + javaEBook.getRemarksAndNotes() + 
                        "\n" + "Publisher: " + javaEBook.getPublisher() + "\n" + "Price: " + javaEBook.getPrice() + " ron"+ "\n" 
                        + "Electronic format: " + javaEBook.getElectronicFormat() + "\n" + "Year of publication: " + javaEBook.getYearOfPublication());
        }
        
}
