/**
 * Program that creates and array and adds items.
 * Activity 5
 * 
 * @author Nick Mitchell - CPSC 1220
 * @version 11/16/23
 */
public class ItemsList {

    private InventoryItem[] inventory;
    private int count;

    /**
     * Constructor.
     */
    public ItemsList() {

        inventory = new InventoryItem[20];
        count = 0;
    }

    /**
     * Method.
     * @param itemIn for new object 
     */
    public void addItem(InventoryItem itemIn) {

        inventory[count] = itemIn;
        count++;

    }

    /**
     * Method.
     * @param electronicsSurcharge for surcharge price.
     * @return total of the sum of all objects in itemsList
     */
    public double calculateTotal(double electronicsSurcharge) {
        double total = 0;
        for (int i = 0; i < count; i++) {
            if (inventory[i] instanceof ElectronicsItem) {
                total += inventory[i].calculateCost() + electronicsSurcharge;
            }
            else {
                total += inventory[i].calculateCost();
            }
        }
        return total;
    }
    
    /**
     * Method.
     * @return String inputs
     */
    public String toString() {
        String output = "All inventory:\n\n";

        for (int i = 0; i < count; i++) {
            output += inventory[i] + "\n";
        }

        return output;

    }
}
