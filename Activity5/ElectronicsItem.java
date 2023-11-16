/**
 * Child class program 
 * 
 * Activity 4
 * @author Nick Mitchell - CPSC1220
 * @version 11/08/23
 */
public class ElectronicsItem extends InventoryItem {

    protected double weight;
    public static final double SHIPPING_COST = 1.5;

    /**
     * Constructor.
     * @param nameIn for name input
     * @param priceIn for price input
     * @param 
     */
    public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
        super(nameIn, priceIn);

        weight = weightIn;
    }

    /**
     * Method.
     * @return overridden calculated cost
     */
    public double calculateCost() {
        return super.calculateCost() + (SHIPPING_COST * weight);
    }
    


}