/**
 * Child class program 
 * 
 * Activity 4
 * @author Nick Mitchell - CPSC1220
 * @version 11/08/23
 */
public abstract class OnlineTextItem extends InventoryItem {

    /**
     * Constructor
     * @param nameIn for name input 
     * @param priceIn for price input 
     */
    public OnlineTextItem(String nameIn, double priceIn) {
        super(nameIn, priceIn);
    }

    /**
     * Method.
     * @return price without tax
     */
    public double calculateCost() {
        return price;
    }
}
