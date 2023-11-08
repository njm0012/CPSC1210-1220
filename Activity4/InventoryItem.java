/**
 * Parent class program 
 * 
 * Activity 4
 * @author Nick Mitchell - CPSC1220
 * @version 11/08/23
 */
public class InventoryItem {

   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
    * Constructor.
    * @param nameIn for name input
    * @param priceIn for price input
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;

   }

   /**
    * Method.
    * @return name
    */
   public String getName() {
    return name;
   }

   /**
    * Method.
    * @return price
    */
   public double calculateCost() {
      price = price * (1 + taxRate);
      return price;
   }

   /**
    * Method.
    * @param taxRateIn for tax input
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;

   }

   /**
    * Method.
    * @return String 
    */
   public String toString() {
    return name + ": $" + calculateCost();
   }

}
