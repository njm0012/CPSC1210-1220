import java.text.DecimalFormat;
import java.util.ArrayList;
/**
 * Represents a list of Ellipsoids
 * 
 * @author Nick Mitchell - CPSC 1210
 * @version 09/22/2023
 */
public class EllipsoidList {


    private String listName;
    private ArrayList<Ellipsoid> eList;

    /**
     * Constructor.
     * @param listNameIn
     * @param eListIn
     */
    public EllipsoidList(String listNameIn, ArrayList<Ellipsoid> eListIn) {
        listName = listNameIn;
        eList = eListIn;
    }

    /**
     * Method.
     * @return name of list
     */
    public String getName() {
        return listName;
    }

    /**
     * Method.
     * @return number of Ellipsoids
     */
    public int numberOfEllipsoids() {
        return eList.size();
    }

    /**
     * Method.
     * @return the total volume of all Ellipsoids
     */
    public double totalVolume() {
        double total = 0;
        int index = 0;
        Ellipsoid volEllipsoid;
        if(eList.size() == 0) {
            total = 0;
        }
        else {
            while (index < eList.size()) {
               volEllipsoid = eList.get(index);
               total += volEllipsoid.volume();
               index++;
            }
        }
        return total;

    }

    /**
     * Method.
     * @return the total surface area 
     */
    public double totalSurfaceArea() {
   
        int index = 0;
        Ellipsoid totalSA;
        double totalArea = 0;
        if (eList.size() == 0) {
           totalArea = 0;
        }
        else {
           while (index < eList.size()) {
              totalSA = eList.get(index);
              totalArea += totalSA.surfaceArea();
              index++;
           }
        
        }
        return totalArea;
    }

    /**
     * Method.
     * @return the average volume of the Ellipsoids
     */
    public double averageVolume() {
        int index = 0;
        Ellipsoid volumeEllipsoid;
        double total = 0;
        double totalEllipsoid = eList.size();
        if (eList.size() == 0) {
           total = 0;
        }
        
        else {
           while (index < eList.size()) {
              volumeEllipsoid = eList.get(index);
              total += volumeEllipsoid.volume();
              index++;
           }
        
        }
        if (eList.size() == 0) {
           return total;
        }
        else {
           return (total / totalEllipsoid);
        }
     
    }

    /**
     * Method.
     * @return the average surface area
     */
    public double averageSurfaceArea() {
      int index = 0;
      Ellipsoid totalSA;
      double totalArea = 0;
      double totalE = eList.size();
      if (eList.size() == 0) {
         totalArea = 0;
      }
      else {
         while (index < eList.size()) {
            totalSA = eList.get(index);
            totalArea += totalSA.surfaceArea();
            index++;
         }
      
      }
      if (eList.size() == 0) {
         return totalArea;
      }
      else {
         return (totalArea / totalE);
      }
    }

    /**
     * Method
     * @return the object names in list
     */
    public String toString() {
   
        int index = 0;
        Ellipsoid ellipsoidIndex;
        String call = listName + "\n";
        while (index < eList.size()) {
           ellipsoidIndex = eList.get(index);
           call += "\n" + ellipsoidIndex.toString() + "\n";
           index++;
        }

        return call;
    }

    /**
     * Method
     * @return the summary 
     */
    public String summaryInfo() {
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output = "----- Summary for " + listName + " -----";
      output += "\nNumber of Ellipsoid Objects: " + numberOfEllipsoids();
      output += "\nTotal Volume: " + df.format(totalVolume()) + " cubic units";
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + " square units";
      output += "\nAverage Volume: " + df.format(averageVolume())
         + " cubic units";
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
         + " square units\n";
   
      return output;

    }

    

}