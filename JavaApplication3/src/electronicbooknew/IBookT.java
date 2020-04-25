/*
 * IBook class.
 */
package electronicbooknew;

/**
 * IBook class.
 * @author servi
 */
public class IBookT extends ElectronicBookT {

        public IBookT(String title, String isbn, String author, String downloadLink, String remarkAndNote, 
                String publisher, String price, String electronicFormat, String yearOfPublication) {
                super.setBookSpecifications(title, isbn, author, downloadLink, remarkAndNote, publisher, price, 
                        electronicFormat, yearOfPublication);
        }
        public enum IBookReader{IPHONE, MACBOOK, IPAD};
        private IBookReader reccomendedReader;
        
        public void setReccomendedReader(String reccomendedReader){
                this.reccomendedReader = IBookReader.valueOf(reccomendedReader);
        }
        
        public IBookReader getReccomendedReader(){
                return reccomendedReader;
        } 
}
