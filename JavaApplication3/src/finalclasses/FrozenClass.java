/*
 * Final class
 */
package finalclasses;

/**
 * Final class
 * @author servi
 */
public final class FrozenClass {
    private final String[] validKeys = {"57klo7", "kjm85o", "5ghj78", "drf857"};
    public boolean checkValidityKey(String key){
        boolean isValid = false;
        for(String currentKey:validKeys){
            if(currentKey.equals(key)){
                isValid = true;
            }
            
        }
        return isValid;
    
    }    
}
