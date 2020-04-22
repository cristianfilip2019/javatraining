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
                EBook javaEBook = new EBook("java", "768945-66", "Ion Creanga", "www.elefant.ro", "excellent book",
                "Editura Nemira", 50.00, ElectronicBook.FormatOfElectronicBook.PDF,ElectronicBook.YearOfPublication.Y_2011);
                System.out.println(javaEBook.getTitle());
                System.out.println(javaEBook.getIsbn());
                System.out.println(javaEBook.getAuthors());
                System.out.println(javaEBook.getDownloadLinks());
                System.out.println(javaEBook.getRemarksAndNotes());
                System.out.println(javaEBook.getPublisher());
                System.out.println(javaEBook.getPrice());
                System.out.println(javaEBook.getElectronicFormat());
                System.out.println(javaEBook.getYearOfPublication());
        }
        
}
