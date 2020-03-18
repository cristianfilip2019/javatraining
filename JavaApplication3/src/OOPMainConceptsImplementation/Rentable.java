
package OOPMainConceptsImplementation;

/**
 *
 * @author servi
 */
public interface Rentable {
    /**
     * @const REC_RENT_PRICE is recommended price to sell
     */
    public static final boolean RENTABLE = true;
    
    /**
     * method returns the value of item that implements the rentable interface.
     * class that implemets the interface should implement this method.
     * @return method returns price for daily rent
     */
    public int getDailyRentPrice();
}
