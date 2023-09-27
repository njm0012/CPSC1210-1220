import java.util.ArrayList;

/**
 * Class that holds a set of integer values representing
 * the temperatures.
 * 
 * @author Nick Mitchell - CPSC 1210
 * @version 09/26/23
 */
public class Temperatures {
    
    ArrayList<Integer> temperatures = new ArrayList<Integer>();

    /**
     * Constructor
     * @param temperaturesIn
     */
    public Temperatures(ArrayList<Integer> temperaturesIn) {
        temperatures = temperaturesIn;
    }

    //Methods
    /**
     * Method.
     * @return lowest temp in list
     */
    public int getLowTemp() {
        if (temperatures.isEmpty()) {
            return 0;
        }
        
        int low = temperatures.get(0);
          for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) < low) {
                 low = temperatures.get(i);
                 }
            }
            return low;
        
    }

    /**
     * Method.
     * @return highest temp in list
     */
    public int getHighTemp() {
        if (temperatures.isEmpty()) {
        return 0;
        }
        
        int high = temperatures.get(0);
          for (Integer temp : temperatures) {
             if ( temp > high) {
                 high = temp;
                }
            }
            return high;
    }

    /**
     * 
     * @param lowIn
     * @return a minumum temperature 
     */
    public int lowerMinimum(int lowIn) {
        return lowIn < getLowTemp() ? lowIn : getLowTemp();
    }

    /**
     * 
     * @param highIn
     * @return a maximum temperature
     */
    public int higherMaximum(int highIn) {
        return highIn > getHighTemp() ? highIn : getHighTemp();
    }

    /**
     * Method.
     * @return string representation 
     */
    public String toString() {
        return "\tTemperatures: " + temperatures
            + "\n\tLow: " + getLowTemp()
            + "\n\tHigh: " + getHighTemp();
    }


}
