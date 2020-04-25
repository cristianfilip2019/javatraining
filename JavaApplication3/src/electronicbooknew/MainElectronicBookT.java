
package electronicbooknew;


import electronicbooknew.EBookT.EBookReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MainElectronicBookT {
        public static final String delimiter = ",";
        
        public static String[] getCondition(Class<? extends Enum<?>> e){
                return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
        }
        
        public static void main(String[] args) {
                String csvFile = "F:\\OneDrive\\desktop\\ElectronicBookCsv.csv";               
                try{
                        File file = new File(csvFile);
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
                        String line = "";
                        String[] tempArr;
                        String headerLine = br.readLine();
                        while((line = br.readLine()) != null){
                                String[] condition = getCondition(EBookReader.class);
                                List<String> conditionList = Arrays.asList(condition);
                                String[] split = line.split(",");
                                if(conditionList.contains(split[9])){
                                        tempArr = line.split(delimiter);  
                                        EBookT eBook = new EBookT(tempArr[0], tempArr[1], tempArr[2], tempArr[3], 
                                                tempArr[4], tempArr[5], tempArr[6], tempArr[7], tempArr[8]);
                                        eBook.setReccomendedReader(tempArr[9]);
                                        System.out.println("Title: " + eBook.getTitle() + "\n" 
                                        + "ISBN: " + eBook.getIsbn() + "\n" 
                                        + "Authors: " + eBook.getAuthors().toString().replace("[","").replace("]","") + "\n"
                                        + "Download links: " + eBook.getDownloadLinks().toString().replace("[","").replace("]","") + "\n" 
                                        + "Remarks and notes: " + eBook.getRemarksAndNotes().toString().replace("[","").replace("]","") + "\n" 
                                        + "Publisher: " + eBook.getPublisher() + "\n" 
                                        + "Price: " + eBook.getPrice() + " ron"+ "\n" 
                                        + "Electronic format: " + eBook.getElectronicFormat() + "\n"
                                        + "Year of publication: " + eBook.getYearOfPublication() + "\n"
                                        + "Reccomended reader: " + eBook.getReccomendedReader());
                                        System.out.println();
                                }else{
                                        tempArr = line.split(delimiter);  
                                        IBookT iBook = new IBookT(tempArr[0], tempArr[1], tempArr[2], tempArr[3], 
                                                tempArr[4], tempArr[5], tempArr[6], tempArr[7], tempArr[8]);
                                        iBook.setReccomendedReader(tempArr[9]);
                                        System.out.println("Title: " + iBook.getTitle() + "\n" 
                                        + "ISBN: " + iBook.getIsbn() + "\n" 
                                        + "Authors: " + iBook.getAuthors().toString().replace("[","").replace("]","") + "\n"
                                        + "Download links: " + iBook.getDownloadLinks().toString().replace("[","").replace("]","") + "\n" 
                                        + "Remarks and notes: " + iBook.getRemarksAndNotes().toString().replace("[","").replace("]","") + "\n" 
                                        + "Publisher: " + iBook.getPublisher() + "\n" 
                                        + "Price: " + iBook.getPrice() + " ron"+ "\n" 
                                        + "Electronic format: " + iBook.getElectronicFormat() + "\n"
                                        + "Year of publication: " + iBook.getYearOfPublication() + "\n"
                                        + "Reccomended reader: " + iBook.getReccomendedReader());
                                        System.out.println();
                                }
                        }
                        br.close();
                }
                catch(IOException ioe){
                        ioe.printStackTrace();
                }               
        }       
}
