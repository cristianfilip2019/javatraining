
package enumprint;

import java.util.Arrays;
import java.util.List;


public class EnumPrint {
        public enum Nume{DARIUS, CRISTIAN, MAMA, TATA};
        
        public static String[] getNames(Class<? extends Enum<?>> e){
                return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
        }
        
        public static void main(String[] args) {
               String[] arrayNume = getNames(Nume.class);
               System.out.println(Arrays.toString(arrayNume));
               List<String> listNume = Arrays.asList(arrayNume);
               if(listNume.contains("DARIUS")){
                       System.out.println(arrayNume[0] + " te iubesc");
               }
               
        }
        
}
