/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicbooknew;

/**
 *
 * @author servi
 */
public class EBookT extends ElectronicBookT {

        public EBookT(String title, String isbn, String author, String downloadLink, String remarkAndNote, 
                String publisher, String price, String electronicFormat, String yearOfPublication) {
                super.setBookSpecifications(title, isbn, author, downloadLink, remarkAndNote, publisher, price, 
                        electronicFormat, yearOfPublication);
        }
        public enum EBookReader{KINDLE, ANDROID_DEVICE, WINDOWS};
        private EBookReader reccomendedReader;
        
        public void setReccomendedReader(String reccomendedReader){
                this.reccomendedReader = EBookReader.valueOf(reccomendedReader);
        }
        
        public EBookReader getReccomendedReader(){
                return reccomendedReader;
        } 
}
